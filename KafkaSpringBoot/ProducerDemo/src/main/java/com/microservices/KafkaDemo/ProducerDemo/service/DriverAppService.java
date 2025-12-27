package com.microservices.KafkaDemo.ProducerDemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class DriverAppService {

    @Autowired
    KafkaTemplate<String, Object> kafkaTemplate;

    public boolean sendUpdates(String location){
        kafkaTemplate.send("location-topic",location);
        return true;
    }
}
