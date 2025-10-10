package com.dev.dxs.MavenProjectDemo1;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Student {

    public void takeAction(){
        System.out.println("Studying .... ");
    }

    @PostConstruct
    public void startAction(){
        System.out.println("About to start with the courses .... ");
    }

    @PreDestroy
    public void endingAction(){
        System.out.println("Ending session ... ");
    }

}
