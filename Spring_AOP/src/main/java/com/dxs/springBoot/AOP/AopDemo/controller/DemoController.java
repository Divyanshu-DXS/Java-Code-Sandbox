package com.dxs.springBoot.AOP.AopDemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@RestController
@RequestMapping("/aop")
@Slf4j
public class DemoController {

    Logger logger = LoggerFactory.getLogger(DemoController.class);

    @GetMapping("/hello")
    public String sayHello(){
//        logger.info(Instant.now()+" .. Entered the sayHello() ... ");
        return "Hello";
    }
}
