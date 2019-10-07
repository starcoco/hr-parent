package com.dingdang.web.feign;

import com.dingdang.pay.service.PayService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

/**
 * @author py
 * @create 2019-10-02 16:30
 **/
@FeignClient(value = "pay")
@Component
public interface PayFeign extends PayService {
}
