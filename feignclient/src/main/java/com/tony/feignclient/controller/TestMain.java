package com.tony.feignclient.controller;


import com.tony.feignclient.service.SendMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/test")
public class TestMain {

    private static SendMsg sendMsg;

    @Autowired
    public void getSendMag(SendMsg sendMsg){
        TestMain.sendMsg = sendMsg;
    }



    @GetMapping("/setMsgRun/{msg}/{number}")
    public void setMsgRun(@PathVariable("msg") String msg , @PathVariable("number")
                          int number){
        System.out.println("假客戶端發出消息 msg:"+msg+" 編號 : "+number);
        sendMsg.setMsgTest(msg,number);

    }

}
