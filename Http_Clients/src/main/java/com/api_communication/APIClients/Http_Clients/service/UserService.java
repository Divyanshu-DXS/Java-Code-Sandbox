package com.api_communication.APIClients.Http_Clients.service;

import com.api_communication.APIClients.Http_Clients.DtoMapper.GitHubUserDTO;
import com.api_communication.APIClients.Http_Clients.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {


    @Value("${githubHost}")
    String gitHubHost;

    @Value("${guthubGetEndpoint}")
    String githubGetEndpoint;

    // ********************** REST TEMPLATE **********************
    @Autowired
    RestTemplate restTemplate;

    List<GithubBooks> books = new ArrayList<>();

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

    public GitHubUserDTO getUserWebClient(String user){
        return webClient.get()
                .uri(gitHubHost+githubGetEndpoint+user)
                .retrieve()
                .bodyToMono(GitHubUserDTO.class)
                .block();

    }

    public GitHubRepos[] getReposList(String user){
        GitHubRepos[] response = webClient.get()
                .uri(gitHubHost+githubGetEndpoint+user+"/repos")
                .retrieve()
                .bodyToFlux(GitHubRepos[].class)
                .blockLast();

        return response;

    }

    // ********************** WEB CLIENT WITH POSTMAN BOOKS API **********************
    /*
    For this part of the demo below here, we will be making use of the simple book api created for practicing requests on 'Postman'
    Github : https://github.com/vdespa/introduction-to-postman-course/tree/main
    This repo has a simple book api that we can interact with
    This API allows you to reserve a book.
    The API is available at https://simple-books-api.click
    */

    public GithubBooks[] getBooks(){
        GithubBooks[] booksList = webClient.get()
                .uri("https://simple-books-api.click/books")
                .retrieve()
                .bodyToFlux(GithubBooks[].class)
                .blockLast();

        return booksList;
    }

    // Get a book by id: Get a single book
    //GET /books/:bookId
     public GithubBooks getBookById(Integer id){
        GithubBooks book = webClient.get()
                .uri("https://simple-books-api.click/books/{id}",id) // This is how path variables can be passed in a webclient request
                .retrieve()
                .bodyToMono(GithubBooks.class)
                .block();
        return book;
     }

     // Posting an order -- requires authentication
     // Token received |: "ff805c7b41cb57c1972f11d7d6c884840c853d02361c02d8582fed1ffd77b8b6"
    // POST /orders
    // The request body needs to be in JSON format and include the following properties:
    //bookId - Integer - Required
    //customerName - String - Required

    String token = "ff805c7b41cb57c1972f11d7d6c884840c853d02361c02d8582fed1ffd77b8b6";
    public ResponseEntity<CreateOrderResponse> postOrder(CreateOrderRequest req){

        return webClient.post()
                .uri("https://simple-books-api.click/orders")
                .header("Authorization", "Bearer " + token)
                .bodyValue(req)
                .retrieve()
                .toEntity(CreateOrderResponse.class)
                .block();
    }
    // ********************** WEB CLIENT WITH POSTMAN BOOKS API **********************

    // ********************** FEIGN CLIENT WITH POSTMAN BOOKS API **********************

    // Get mapping for all books



}
