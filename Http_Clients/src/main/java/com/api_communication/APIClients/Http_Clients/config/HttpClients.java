package com.api_communication.APIClients.Http_Clients.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class HttpClients {

    // You can use RestTemplate directly, but the recommended practice is to register it as a Spring bean.
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @Bean
    public WebClient webClient(){
        return WebClient.builder().build();
    }

}
