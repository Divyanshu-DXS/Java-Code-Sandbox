package com.dxs.circuitBreaker.ServiceA.controller;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Date;

@RestController
@RequestMapping("/a")
public class ServiceAController {

    String baseUrl = "http://localhost:8086";

    @Autowired
    RestTemplate restTemplate;

    @GetMapping
    @CircuitBreaker(name = "service-A",fallbackMethod = "serviceAFallback")
    public String serviceA(){
        return restTemplate.getForObject(baseUrl+"/b",String.class);
    }

    int count =1;
    @GetMapping("/retryA")
    @Retry(name = "retryService-A")
    public String serviceARetryDemo(){
        System.out.println("Retry method called "+ count++ +" @" + new Date());
        return restTemplate.getForObject(baseUrl+"/b",String.class);
    }

    // make sure when creating the fallback method the return type should be the same, and we inject exception object
    public String serviceAFallback(Exception ex){
        return "Service A fallback method ! ...";
    }


}
