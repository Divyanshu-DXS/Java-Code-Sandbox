package com.api_communication.APIClients.Http_Clients.service;

import com.api_communication.APIClients.Http_Clients.DtoMapper.DtoMapperToEntity;
import com.api_communication.APIClients.Http_Clients.DtoMapper.GitHubUserDTO;
import com.api_communication.APIClients.Http_Clients.config.HttpClients;
import com.api_communication.APIClients.Http_Clients.model.GitHubRepos;
import com.api_communication.APIClients.Http_Clients.model.GithubUsers;
import com.api_communication.APIClients.Http_Clients.repository.GithubUserRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Optional;

@Service
public class GithubUsersService {

    @Autowired
    GithubUserRepository githubUserRepository;

    @Autowired
    WebClient webClient;

    @Autowired
    UserService userService;

    @Autowired
    DtoMapperToEntity dtoMapper;

    public GithubUsers getUser(String name){
        Optional<GithubUsers> existingUser = Optional.ofNullable(githubUserRepository.findByLogin(name));
        if(existingUser.isPresent()){
            return existingUser.get();
        }

        GitHubUserDTO userDTO = userService.getUserWebClient(name);
        GithubUsers userEntity = dtoMapper.mapDtoToEntity(userDTO);
        githubUserRepository.save(userEntity);
        return userEntity;
    }

}
