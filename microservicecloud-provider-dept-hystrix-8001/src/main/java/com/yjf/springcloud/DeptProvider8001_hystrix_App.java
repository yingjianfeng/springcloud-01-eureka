package com.yjf.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient //本服务启动后会自动注册进eureka服务中
@SpringBootApplication
@EnableDiscoveryClient //服务发现
@EnableCircuitBreaker//对hystrixR熔断机制的支持
public class DeptProvider8001_hystrix_App
{
    public static void main(String[] args)
    {
        SpringApplication.run(DeptProvider8001_hystrix_App.class, args);
    }
}

