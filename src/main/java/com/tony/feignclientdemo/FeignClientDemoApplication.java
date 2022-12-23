package com.tony.feignclientdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
// EnableEurekaClient 能接收假客戶端傳來得請求 接收方式跟一般前端請求一樣
@EnableEurekaClient
public class FeignClientDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignClientDemoApplication.class, args);
    }

}
