package com.api_communication.APIClients.Http_Clients.controller;

import com.api_communication.APIClients.Http_Clients.model.GitHubRepos;
import com.api_communication.APIClients.Http_Clients.service.UserService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
@RequestMapping("/github")
public class githubApiController {


    @Autowired
    UserService userService;

    @GetMapping("/getUser/{name}")
    public ResponseEntity<String> getUserByName(@PathVariable String name){
        return userService.getUser(name);
    }

    @GetMapping("/getRepos/{name}/repos")
    public GitHubRepos[] getRepos(@PathVariable String name){
        return userService.getRepos(name);
    }

    // Getting user using web client service method
    @GetMapping("/gettingUsers/{name}")
    public ResponseEntity<String> getUser(@PathVariable String name){
        return userService.getUserWebClient(name);
    }

    // Getting user repos list using web client service method
    @GetMapping("/repos/{user}")
    public GitHubRepos[] gerRepoListWebClient(@PathVariable String user){
        return userService.getReposList(user);
    }

}
