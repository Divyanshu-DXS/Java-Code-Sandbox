package com.api_communication.APIClients.Http_Clients.controller;

import com.api_communication.APIClients.Http_Clients.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class githubApiController {

    @Autowired
    UserService userService;

    @GetMapping("/getUser/{name}")
    public ResponseEntity<String> getUserByName(@PathVariable String name){
        return userService.getUser(name);
    }

}
