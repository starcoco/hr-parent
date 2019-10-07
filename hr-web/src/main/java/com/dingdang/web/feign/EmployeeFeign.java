package com.dingdang.web.feign;

import com.dingdang.employee.service.EmployeeService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

/**
 * @author py
 * @create 2019-09-18 10:32
 **/
@FeignClient(value = "employee")
@Component
public interface EmployeeFeign extends EmployeeService {
}
