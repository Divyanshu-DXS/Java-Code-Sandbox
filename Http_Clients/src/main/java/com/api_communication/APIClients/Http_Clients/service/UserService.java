package com.api_communication.APIClients.Http_Clients.service;

import com.api_communication.APIClients.Http_Clients.model.GitHubRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

import java.util.ArrayList;

@Service
public class UserService {


    @Value("${githubHost}")
    String gitHubHost;

    @Value("${guthubGetEndpoint}")
    String githubGetEndpoint;

    // ********************** REST TEMPLATE **********************
    @Autowired
    RestTemplate restTemplate;

    public ResponseEntity<String> getUser(String name){
        return restTemplate.getForEntity(gitHubHost+githubGetEndpoint+name,String.class,name);
    }

    public GitHubRepos[] getRepos(String name){
        return restTemplate.getForObject(gitHubHost+githubGetEndpoint+name+"/repos",GitHubRepos[].class);
    }
    // ********************** REST TEMPLATE **********************

    // ********************** WEB CLIENT **********************
    @Autowired
    WebClient webClient;

    public ResponseEntity<String> getUserWebClient(String user){
        String response = webClient.get()
                .uri(gitHubHost+githubGetEndpoint+user)
                .retrieve()
                .bodyToMono(String.class)
                .block();

        return ResponseEntity.ok(response);
    }

    public GitHubRepos[] getReposList(String user){
        GitHubRepos[] response = webClient.get()
                .uri(gitHubHost+githubGetEndpoint+user+"/repos")
                .retrieve()
                .bodyToFlux(GitHubRepos[].class)
                .blockLast();

        return response;

    }

}
