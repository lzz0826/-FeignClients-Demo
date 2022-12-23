package com.tony.feignclientdemo;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/FeignClient")
public class ReceiveController {

    @PostMapping("/get")
    public void test(@RequestParam String msg , @RequestParam int number){
        System.out.println("接收到 msg : " + msg);
        System.out.println("接收到number : " + number);
    }



}
