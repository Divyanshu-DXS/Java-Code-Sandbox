package com.dxs.projects.library_backend.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;
import org.springframework.context.annotation.Primary;

@Data
@Builder
public class BookDTO {
    @Id private int id;
    String name ;
    String author;
    String production;
    String version;

//    public Book(String name, String author, String production, String version) {
//        this.name = name;
//        this.author = author;
//        this.production = production;
//        this.version = version;
//    }

    public BookDTO() {
    }

    public BookDTO(int id, String name, String author, String production, String version) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.production = production;
        this.version = version;
    }
}
