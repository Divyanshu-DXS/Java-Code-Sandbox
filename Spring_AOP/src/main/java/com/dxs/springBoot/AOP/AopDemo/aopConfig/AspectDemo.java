package com.dxs.springBoot.AOP.AopDemo.aopConfig;

import com.dxs.springBoot.AOP.AopDemo.controller.DemoController;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Slf4j
@Component
public class AspectDemo {

    // joinPoints
    // cross cutting concers
    // Advice - before, after, around
    // pointcut

    Logger logger = LoggerFactory.getLogger(AspectDemo.class);

    @Before("execution(String com.dxs.springBoot.AOP.AopDemo.controller.DemoController.sayHello(..))")
    public void randomName(ProceedingJoinPoint pjp) throws Throwable {

        logger.info("Logs from apsect class logged ....");

        logger.info("log completed ... the returned output is : " + pjp.proceed().toString());
    }

}
