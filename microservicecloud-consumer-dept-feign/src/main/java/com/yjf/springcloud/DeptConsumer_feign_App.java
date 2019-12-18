package com.yjf.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.yjf.springcloud"})
@ComponentScan("com.yjf.springcloud")
public class DeptConsumer_feign_App {
    public static void main(String[] args)
    {
        SpringApplication.run(DeptConsumer_feign_App.class, args);
    }
}
