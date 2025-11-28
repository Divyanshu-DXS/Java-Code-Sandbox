package com.api_communication.APIClients.Http_Clients.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter @Setter
@Entity(name="Github_Repos")
public class GitHubRepos {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column
    String name;
    @Column
    String language;
    @JsonProperty("private")
    boolean isPrivate;

    public GitHubRepos(Long id, String name, String language, boolean isPrivate) {
        this.id = id;
        this.name = name;
        this.language = language;
        this.isPrivate = isPrivate;
    }

    public GitHubRepos() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
