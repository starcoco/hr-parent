package com.dingdang.web.feign;

import com.dingdang.login.service.HrManagerService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

/**
 * @author py
 * @create 2019-09-16 19:23
 **/
@FeignClient(value = "login")
@Component
public interface LoginServiceFeign extends HrManagerService {

}
