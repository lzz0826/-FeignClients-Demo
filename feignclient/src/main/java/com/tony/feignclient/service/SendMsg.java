package com.tony.feignclient.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;




@FeignClient(name="receive-feign-client-demo", url = "127.0.0.1:8082")//spring service name
// name 接收方的 application.properties 設定的 spring.application.name= receive-feign-client-demo
// url  接收方的 url加pont  application.properties 設定的 server.port= 8082
public interface SendMsg {

    @PostMapping("/FeignClient/get")//接收方的url (FeignClientDemo 的 ReceiveController)
    void setMsgTest(@RequestParam String msg, @RequestParam int number);


}
