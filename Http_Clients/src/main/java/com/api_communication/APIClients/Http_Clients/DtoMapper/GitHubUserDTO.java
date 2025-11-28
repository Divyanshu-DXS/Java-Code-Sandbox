package com.api_communication.APIClients.Http_Clients.DtoMapper;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter@Setter
public class GitHubUserDTO {
    String login;
    Long id;
    String url;
    String name;
    Integer public_repos;

    public GitHubUserDTO() {
    }

    public GitHubUserDTO(String login, Long id, String url, String name, Integer public_repos) {
        this.login = login;
        this.id = id;
        this.url = url;
        this.name = name;
        this.public_repos = public_repos;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPublic_repos() {
        return public_repos;
    }

    public void setPublic_repos(Integer public_repos) {
        this.public_repos = public_repos;
    }
}
