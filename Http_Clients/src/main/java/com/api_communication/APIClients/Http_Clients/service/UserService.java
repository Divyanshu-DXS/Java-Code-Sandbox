package com.api_communication.APIClients.Http_Clients.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {

    @Autowired
    RestTemplate restTemplate;

    @Value("${githubHost}")
    String gitHubHost;

    @Value("${guthubGetEndpoint}")
    String githubGetEndpoint;

    public ResponseEntity<String> getUser(String name){
        return restTemplate.getForEntity(gitHubHost+githubGetEndpoint+name,String.class,name);
    }
}
