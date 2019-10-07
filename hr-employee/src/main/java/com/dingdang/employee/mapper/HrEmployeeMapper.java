package com.dingdang.employee.mapper;

import com.dingdang.employee.pojo.HrDepartment;
import com.dingdang.employee.pojo.HrEmployee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface HrEmployeeMapper {
 /**
  * 按部门查找职员信息
  * @param deptid
  * @return
  */
 public List<HrEmployee> FindByDeptment(int deptid);

 /**
  * 按id查找用户信息
  * @param emid
  * @return
  */
 public HrEmployee findById(int emid);

 /**
  * 删除用户信息
  * @param emid
  * @return
  */
 public int deleteById(int emid);

 /**
  * 更改子父关系
  * @param type
  * @param account
  */
 public void updateByType(@Param("type") String type,@Param("account") String account);

 /**
  * 根据部门名更新岗位
  * @param hrEmployee
  * @return
  */
 public int updateById(@Param("hrEmployee")HrEmployee hrEmployee);

 /**
  * 查找部门表信息
  * @return
  */
 public List<HrDepartment> findDept();

 /**
  * 按工号查姓名
  * @param account
  * @return
  */
 public HrEmployee findByAccount(String account);

 /**
  * 查找所有实习生
  * @return
  */
 public List<HrEmployee> findByMark(String emMark);
}