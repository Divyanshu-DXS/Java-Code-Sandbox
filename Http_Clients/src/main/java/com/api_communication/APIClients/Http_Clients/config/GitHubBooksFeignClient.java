package com.api_communication.APIClients.Http_Clients.config;

import com.api_communication.APIClients.Http_Clients.model.GithubBooks;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="GithubBookClient", url = "https://simple-books-api.click")
public interface GitHubBooksFeignClient {
    @GetMapping("/books")
    GithubBooks[] getBooks();
}
