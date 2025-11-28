package com.api_communication.APIClients.Http_Clients.DtoMapper;

import com.api_communication.APIClients.Http_Clients.model.GithubUsers;
import lombok.Builder;
import org.springframework.boot.autoconfigure.info.ProjectInfoProperties;
import org.springframework.stereotype.Component;


@Component
public class DtoMapperToEntity{

    public GithubUsers mapDtoToEntity(GitHubUserDTO userDTO){

        GithubUsers user = new GithubUsers();
        user.setId(userDTO.getId());
        user.setLogin(userDTO.getLogin());
        user.setName(userDTO.getName());
        user.setUrl(userDTO.getUrl());
        user.setRepoCount(userDTO.getPublic_repos());

        return user;
    }

    public GitHubUserDTO mapEntityToDTO(GithubUsers users){
        GitHubUserDTO userDTO = new GitHubUserDTO();
        userDTO.setId(users.getId());
        userDTO.setLogin(users.getLogin());
        userDTO.setName(users.getName());
        userDTO.setUrl(users.getUrl());
        userDTO.setPublic_repos(users.getRepoCount());

        return userDTO;
    }
}