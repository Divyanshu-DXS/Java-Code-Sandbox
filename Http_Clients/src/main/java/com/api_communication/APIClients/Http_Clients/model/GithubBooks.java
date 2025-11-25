package com.api_communication.APIClients.Http_Clients.model;

import lombok.Data;

@Data
public class GithubBooks {

    Integer id;
    String name;
    String type;
    Boolean available;

    public GithubBooks(Integer id, String name, String type, Boolean available) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.available = available;
    }

    public GithubBooks() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }
}

