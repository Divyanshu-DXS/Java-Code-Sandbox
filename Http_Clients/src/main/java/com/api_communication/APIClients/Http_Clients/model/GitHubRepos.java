package com.api_communication.APIClients.Http_Clients.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter @Setter
public class GitHubRepos {
    String name;
    String language;
    @JsonProperty("private")
    boolean isPrivate;

//    public GitHubRepos() {
//    }
//
//    public GitHubRepos(String name, String language) {
//        this.name = name;
//        this.language = language;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public boolean isPrivate() {
        return isPrivate;
    }

    public void setPrivate(boolean aPrivate) {
        isPrivate = aPrivate;
    }
}
