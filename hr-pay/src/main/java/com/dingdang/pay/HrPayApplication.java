package com.dingdang.pay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ApplicationContext;

/**
 * Created by Administrator on 2017/12/6.
 */
@EnableDiscoveryClient
@SpringBootApplication
public class HrPayApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(HrPayApplication.class, args);
    }

}
