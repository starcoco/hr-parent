package com.dingdang.web.feign;

import com.dingdang.check.service.checkService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

/**
 * @author py
 * @create 2019-10-03 19:11
 **/
@FeignClient(value = "check")
@Component
public interface checkFeign extends checkService {
}
