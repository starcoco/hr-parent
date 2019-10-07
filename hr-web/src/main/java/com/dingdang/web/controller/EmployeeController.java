package com.dingdang.web.controller;

import com.dingdang.employee.pojo.HrDepartment;
import com.dingdang.employee.pojo.HrEmployee;
import com.dingdang.web.feign.EmployeeFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author py
 * @create 2019-09-18 10:29
 **/
@Controller
public class EmployeeController {
    @Autowired
    EmployeeFeign employeeFeign;
    @RequestMapping("/findByDept")
    public String findByDeptment(int deptid, Model model){
        List<HrEmployee> list=employeeFeign.FindByDeptment(deptid);
        List<HrDepartment> list2=employeeFeign.findDept();
        model.addAttribute("dept",list2);
        model.addAttribute("emlist",list);
        return "empall";
    }
    @RequestMapping("/findById")
    public String findById(Model model,int emid){
        HrEmployee hrEmployee=employeeFeign.findById(emid);
        model.addAttribute("eminfo",hrEmployee);
        return "empinfo";
    }
    @RequestMapping("/deleteById")
    public String deleteById(int emid,String account){
        employeeFeign.deleteById(emid);
        employeeFeign.updateByType("空缺",account);
        return "redirect:findByDept";
    }
    @RequestMapping("/updateById")
    public String updateById(HrEmployee hrEmployee){
        employeeFeign.updateById(hrEmployee);
        return "redirect:findById";
    }
    @RequestMapping("/updateMark")
    public String updateMark(Integer emid){
        System.out.println(emid);
        HrEmployee hrEmployee=new HrEmployee();
        hrEmployee.setEmId(emid);
        hrEmployee.setEmMark("1");
        employeeFeign.updateById(hrEmployee);
        return "redirect:findByMark";
    }
    @RequestMapping("/findDept")
    public String findDept(Model model){
        List<HrDepartment> list=employeeFeign.findDept();
        model.addAttribute("dept",list);
        return "empall";
    }
    @RequestMapping("/findByMark")
    public String findByMark(Model model){
        List<HrEmployee> list=employeeFeign.findByMark("0");
        model.addAttribute("mark",list);
        return "empshixi";
    }

}
