package com.dingdang.pay.mapper;

import com.dingdang.pay.pojo.HrPay;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface HrPayMapper {
    /**
     * 所有员工工资表
     * @return
     */
    public List<HrPay> getAll();

    /**
     * 按部门和月份显示薪资
     * @param did
     * @return
     */
    public List<HrPay> getByDept(@Param("did") Integer did,@Param("bz") Integer bz);

    public void setPay(HrPay hrPay);
    public void updatePay(@Param("hrPay") HrPay hrPay);
    public void deletePay(Integer pid);
    public HrPay findById(Integer pid);

}