package com.microservices.KafkaDemo.ConsumerDemo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class UserConsumerAppService {

    @KafkaListener(topics = "location-topic", groupId = "user_group")
    public void receiveLocationUpdates(String location){
        System.out.println(location);
    }
}
