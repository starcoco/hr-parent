package com.dingdang.login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HrLoginApplication {

    public static void main(String[] args) {
        SpringApplication.run(HrLoginApplication.class, args);
    }

}
