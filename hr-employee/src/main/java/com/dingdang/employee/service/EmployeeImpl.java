package com.dingdang.employee.service;

import com.dingdang.employee.mapper.HrEmployeeMapper;
import com.dingdang.employee.pojo.HrDepartment;
import com.dingdang.employee.pojo.HrEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author py
 * @create 2019-09-18 10:39
 **/
@RestController
public class EmployeeImpl implements EmployeeService {
    @Autowired
    HrEmployeeMapper hrEmployeeMapper;
    @Override
    public List<HrEmployee> FindByDeptment(@RequestParam("deptid") Integer deptid) {
       List<HrEmployee> list= hrEmployeeMapper.FindByDeptment(deptid);
        return list;
    }

    @Override
    public HrEmployee findById(@RequestParam("emid") int emid) {
        HrEmployee hrEmployee=hrEmployeeMapper.findById(emid);
        return hrEmployee;
    }

    @Override
    public int deleteById(@RequestParam("emid") int emid) {
        int count=hrEmployeeMapper.deleteById(emid);
        return count;
    }

    @Override
    public void updateByType(String type, String account) {

        hrEmployeeMapper.updateByType(type,account);
    }

    @Override
    public int updateById(@RequestBody HrEmployee hrEmployee) {
        int count=hrEmployeeMapper.updateById(hrEmployee);
        return count;
    }

    @Override
    public HrEmployee findByAccount(@RequestParam("account")String account) {
        HrEmployee hrEmployee=hrEmployeeMapper.findByAccount(account);
        System.out.println(hrEmployee.getEmImg()+"gggg");
        return hrEmployee;
    }

    @Override
    public List<HrDepartment> findDept() {
        List<HrDepartment> list=hrEmployeeMapper.findDept();
        return list;
    }

    @Override
    public List<HrEmployee> findByMark(String mark) {
        List<HrEmployee> list=hrEmployeeMapper.findByMark(mark);
        return list;
    }
}
