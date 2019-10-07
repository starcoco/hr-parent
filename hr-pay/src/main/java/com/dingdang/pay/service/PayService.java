package com.dingdang.pay.service;

import com.dingdang.pay.pojo.HrPay;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author py
 * @create 2019-10-02 16:20
 **/
@RequestMapping("/pay")
public interface PayService {
    @RequestMapping("/getall")
    public List<HrPay> getAll();
    @RequestMapping("/getByDept")
    public List<HrPay> getByDept(@RequestParam("did") Integer did,@RequestParam("bz") Integer bz);
    @RequestMapping("/insert")
    public void setPay(@RequestBody HrPay hrPay);
    @RequestMapping("/update")
    public void updatePay(@RequestBody HrPay hrPay);
    @RequestMapping("/delete")
    public void deletePay(@RequestParam("pid") Integer pid);
    @RequestMapping("/findByid")
    public HrPay findById(@RequestParam("pid") Integer pid);

}
