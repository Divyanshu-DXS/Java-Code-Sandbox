package com.dxs.springBoot.AOP.AopDemo.service;

import com.dxs.springBoot.AOP.AopDemo.model.Message;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

    public Message getMessage(){
        return new Message("Message from Service");
    }

    public Message getErrorMessage(){
        throw new RuntimeException("Error message from service");
    }
}
