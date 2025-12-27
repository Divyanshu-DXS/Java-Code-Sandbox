package com.microservices.KafkaDemo.ProducerDemo.controller;

import com.microservices.KafkaDemo.ProducerDemo.service.DriverAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/location")
public class DriverAppController {

    @Autowired
    DriverAppService driverAppService;

    @PutMapping("getUpdate")
    public String getLocationUpdate() throws InterruptedException {

        int timer=100;
        while (timer >0){
            driverAppService.sendUpdates(Math.random()*100 + " " + Math.random()*100);
            Thread.sleep(100);
            timer --;
        }
        return "Current Location Updating";
    }
}
