package com.dxs.circuitBreaker.ServiceA.controller;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/a")
public class ServiceAController {

    String baseUrl = "http://localhost:8086";

    @Autowired
    RestTemplate restTemplate;

    @GetMapping
    @CircuitBreaker(name = "service-A")
    public String serviceA(){
        return restTemplate.getForObject(baseUrl+"/b",String.class);
    }


}
