package com.dingdang.employee.service;

import com.dingdang.employee.pojo.HrDepartment;
import com.dingdang.employee.pojo.HrEmployee;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author py
 * @create 2019-09-18 10:39
 **/
@RequestMapping("/employee")
public interface EmployeeService {
    @RequestMapping("/findByDept")
    public List<HrEmployee> FindByDeptment(@RequestParam("deptid") Integer deptid);
    @RequestMapping("/findById")
    public HrEmployee findById(@RequestParam("emid") int emid);
    @RequestMapping("/deleteById")
    public int deleteById(@RequestParam("emid") int emid);
    @RequestMapping("/updateByType")
    public void updateByType(@RequestParam("type") String type,@RequestParam("account") String account);
    @RequestMapping("/updateById")
    public int updateById(@RequestBody HrEmployee hrEmployee);
    @RequestMapping("/findAccount")
    public HrEmployee findByAccount(@RequestParam("account")String account);
    @RequestMapping("/finddept")
    public List<HrDepartment> findDept();
    @RequestMapping("/findByMark")
    public List<HrEmployee> findByMark(@RequestParam("mark")String mark);
}
