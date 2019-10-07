package com.dingdang.web.controller;

import com.dingdang.employee.pojo.HrDepartment;
import com.dingdang.pay.pojo.HrPay;
import com.dingdang.web.feign.EmployeeFeign;
import com.dingdang.web.feign.PayFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;

/**
 * @author py
 * @create 2019-10-02 16:35
 **/
@Controller
public class PayController {
    @Autowired
    PayFeign payFeign;
    @Autowired
    EmployeeFeign employeeFeign;

    @RequestMapping("/getPayAll")
    public String getAll(Model model){
        List<HrPay> list=payFeign.getAll();
        List<HrDepartment> list2=employeeFeign.findDept();
        model.addAttribute("payDept",list);
        model.addAttribute("dept",list2);
        return "payall";
    }
    @RequestMapping("/getPayByDept")
    public String getByDept(Integer did,  Integer bz, Model model){
        List<HrDepartment> list2=employeeFeign.findDept();
        List<HrPay> list=payFeign.getByDept(did,bz);
        model.addAttribute("payDept",list);
        model.addAttribute("dept",list2);
        model.addAttribute("id",did);
        return "payall";
    }
    @RequestMapping("/findByPayId")
    public String findById(Integer pid,Model model){
        HrPay hrPay=payFeign.findById(pid);
        model.addAttribute("hrpay",hrPay);
        return "payupdate";
    }
    public void SetSum(HrPay hrPay){
        System.out.println(hrPay.getPayId());
        int time=hrPay.getPayOvertime()*100;
        hrPay.setPayCheck(200);
        int sum=hrPay.getPayBasemoney()+time+hrPay.getPayMore()+hrPay.getPayCheck();
        hrPay.setPayAbsent((float)sum);
        float point=sum-hrPay.getPayLbmoney();
        if(point<5000){
            hrPay.setPayPoint(0.0f);
        }else if(point>5000&&point<=8000){
            hrPay.setPayPoint((point-5000)*0.03f);
        }else if(point>8000&&point<=17000){
            hrPay.setPayPoint((point-8000)*0.1f+3000*0.03f);
        }else if(point>17000&&point<=30000){
            hrPay.setPayPoint((point-17000)*0.2f+9000*0.1f+3000*0.03f);
        }else{
            hrPay.setPayPoint((point-30000)*0.3f+13000*0.2f+9000*0.1f+3000*0.03f);
        }
        float cutsum=hrPay.getPayLbmoney()+hrPay.getPayPoint()+hrPay.getPayFulimoney();
        hrPay.setPayAllcut(cutsum);
        hrPay.setPaySafety(sum-cutsum);
    }
    @RequestMapping("/updatePay")
    public String updateById(HrPay hrPay){
        SetSum(hrPay);
        payFeign.updatePay(hrPay);
        return "redirect:getPayAll";
    }
    @RequestMapping("/insertPay")
    public String insert(HrPay hrPay){
        SetSum(hrPay);
        Date day=new Date();
        hrPay.setPayBz(day.getMonth()+1+"");
        payFeign.setPay(hrPay);
        return "redirect:getPayAll";
    }
}
