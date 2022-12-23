package com.tony.feignclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;


@EnableEurekaClient
// basePackages 讓Spring boot 抓到 FeignClients 路徑
@EnableFeignClients(basePackages = {"com.tony.feignclient"})
@SpringBootApplication
//**抓不到路徑所以加上
@ComponentScan(basePackages = {"com.tony"})
public class FeignclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignclientApplication.class, args);
    }

}
