package com.api_communication.APIClients.Http_Clients.controller;

import com.api_communication.APIClients.Http_Clients.DtoMapper.GitHubUserDTO;
import com.api_communication.APIClients.Http_Clients.config.GitHubBooksFeignClient;
import com.api_communication.APIClients.Http_Clients.model.*;
import com.api_communication.APIClients.Http_Clients.service.GithubUsersService;
import com.api_communication.APIClients.Http_Clients.service.UserService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.security.PublicKey;
import java.util.logging.Logger;

@RestController
@RequestMapping("/github")
public class githubApiController {


    @Autowired
    UserService userService;

    @Autowired
    GitHubBooksFeignClient gitHubBooksFeignClient;

    @Autowired
    GithubUsersService githubUsersService;

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
    public GitHubUserDTO getUser(@PathVariable String name){
        return userService.getUserWebClient(name);
    }

    // Getting user repos list using web client service method
    @GetMapping("/repos/{user}")
    public GitHubRepos[] gerRepoListWebClient(@PathVariable String user){
        return userService.getReposList(user);
    }

    /*
    For this part of the demo below here, we will be making use of the simple book api created for practicing requests on 'Postman'
    Github : https://github.com/vdespa/introduction-to-postman-course/tree/main
    This repo has a simple book api that we can interact with
    This API allows you to reserve a book.
    The API is available at https://simple-books-api.click
    */

    @GetMapping("/books-api/books")
    public GithubBooks[] getBooksList(){
        return userService.getBooks();
    }

    // Getting a book by id
    @GetMapping("/books-api/id/{id}")
    public GithubBooks getBookById(@PathVariable Integer id){
        return userService.getBookById(id);
    }

    // Placing an order
    @PostMapping("/placeOrder")
    public ResponseEntity<CreateOrderResponse> placeOrder(@RequestBody CreateOrderRequest req){
        return userService.postOrder(req);
    }

    // ********************** FEIGN CLIENT WITH POSTMAN BOOKS API **********************

    @GetMapping("/feign-client/books")
    public GithubBooks[] getallBooks(){
        return gitHubBooksFeignClient.getBooks();
    }

    // DTO Mapping and Persisting tests
    @GetMapping("/getUsersDB/{name}")
    public GithubUsers getUsersMapped(@PathVariable String name){
        return githubUsersService.getUser(name);
    }

}
