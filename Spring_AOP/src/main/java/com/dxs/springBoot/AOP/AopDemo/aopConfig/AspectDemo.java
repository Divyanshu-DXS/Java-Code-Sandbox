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
//@Slf4j
@Component
public class AspectDemo {

    Logger log = LoggerFactory.getLogger(AspectDemo.class);
    @Pointcut("execution(* com.dxs.springBoot.AOP.AopDemo.*.*.*(..))")
    public void pointcut1(){

    }

    @Before("pointcut1()")
    public void logBefore(JoinPoint jp){
        log.info("Entering the message block : "+ jp.getSignature() + " at : "+Instant.now());
    }

    @After("pointcut1()")
    public void afterAdvice(JoinPoint jp){
        log.info("Exiting the message block : "+ jp.getSignature() + " at : "+Instant.now() + "\nResult of the block was - "+jp.getTarget());
    }

    @AfterReturning(value = "pointcut1()", returning = "result")
    public void afterReturningAdvice(Object result){
        log.info("This is the after returning advice : the result is - " + result);
    }

    @AfterThrowing(value = "pointcut1()",throwing = "ex")
    public void afterThrowingAdvice(Exception ex){
        log.error("Exception occured :" + ex.getMessage());
    }

    @Around("pointcut1()")
    public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable{
        long start = System.currentTimeMillis();

        Object result = pjp.proceed();
        log.info("This is the around block, capturing result of the block - " + result.toString());
        long end = System.currentTimeMillis();
        log.info("total time taken here for this block execution is " + (end-start));

        return result;

    }

}
