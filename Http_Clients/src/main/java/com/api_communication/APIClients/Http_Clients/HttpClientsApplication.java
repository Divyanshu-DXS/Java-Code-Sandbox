package com.api_communication.APIClients.Http_Clients;

import com.api_communication.APIClients.Http_Clients.service.GithubUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class HttpClientsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HttpClientsApplication.class, args);
	}

}
