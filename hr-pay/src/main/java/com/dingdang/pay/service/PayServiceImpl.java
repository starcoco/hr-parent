package com.dingdang.pay.service;

import com.dingdang.pay.mapper.HrPayMapper;
import com.dingdang.pay.pojo.HrPay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author py
 * @create 2019-10-02 16:20
 **/
@RestController
public class PayServiceImpl implements PayService {
    @Autowired
    HrPayMapper hrPayMapper;
    @Override
    public List<HrPay> getAll() {
        List<HrPay> list=hrPayMapper.getAll();
        return list;
    }

    @Override
    public List<HrPay> getByDept(@RequestParam("did") Integer did,@RequestParam("bz") Integer bz ){
        List<HrPay> list=hrPayMapper.getByDept(did,bz);
        return list;
    }

    @Override
    public void setPay(@RequestBody HrPay hrPay) {
        hrPayMapper.setPay(hrPay);
    }

    @Override
    public void updatePay(@RequestBody HrPay hrPay) {
        hrPayMapper.updatePay(hrPay);
    }

    @Override
    public void deletePay(@RequestParam("pid") Integer pid) {
        hrPayMapper.deletePay(pid);
    }

    @Override
    public HrPay findById(@RequestParam("pid") Integer pid) {
        HrPay hrPay=hrPayMapper.findById(pid);
        return hrPay;
    }

}
