package com.dxs.springBoot.AOP.AopDemo.aopConfig;

import com.dxs.springBoot.AOP.AopDemo.controller.DemoController;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Aspect
@Slf4j
@Component
public class AspectDemo {

    Logger log = LoggerFactory.getLogger(AspectDemo.class);
    @Pointcut("execution(* com.dxs.springBoot.AOP.AopDemo.controller.*.*(..))")
    public void pointcut1(){

    }

    @Before("pointcut1()")
    public void logBefore(JoinPoint jp){
        log.info("Entering the message block : "+ jp.getSignature() + " at : "+Instant.now());
    }

}
