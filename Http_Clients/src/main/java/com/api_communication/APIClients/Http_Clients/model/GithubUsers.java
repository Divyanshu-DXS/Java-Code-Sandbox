package com.api_communication.APIClients.Http_Clients.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class GithubUsers {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long db_id;
    @Column
    Long id;
    @Column
    String login;
    @Column
    String name;
    @Column
    String url;
    @Column
    Integer repoCount;

    public GithubUsers() {
    }

    public GithubUsers(Long db_id, Long id, String login, String name, String url, Integer repoCount) {
        this.db_id = db_id;
        this.id = id;
        this.login = login;
        this.name = name;
        this.url = url;
        this.repoCount = repoCount;
    }

    public Long getDb_id() {
        return db_id;
    }

    public void setDb_id(Long db_id) {
        this.db_id = db_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getRepoCount() {
        return repoCount;
    }

    public void setRepoCount(Integer repoCount) {
        this.repoCount = repoCount;
    }
}
