package com.dxs.springBoot.AOP.AopDemo.controller;

import com.dxs.springBoot.AOP.AopDemo.model.Message;
import com.dxs.springBoot.AOP.AopDemo.service.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@RestController
@RequestMapping("/aop-api")
public class DemoController {

    @Autowired
    DemoService demoService;

    @GetMapping("/message")
    public Message sayHello(){
        return demoService.getMessage();
    }

    @GetMapping("/error")
    public Message showError(){
        return demoService.getErrorMessage();
    }

}
