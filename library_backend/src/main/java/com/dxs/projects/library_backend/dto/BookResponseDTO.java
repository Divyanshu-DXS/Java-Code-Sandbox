package com.dxs.projects.library_backend.dto;

import com.dxs.projects.library_backend.entities.Rating;
import com.dxs.projects.library_backend.entities.Review;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;
import org.springframework.context.annotation.Primary;

import java.util.List;

@Data
@Builder
public class BookResponseDTO {
    @Id private int id;
    String name ;
    String author;
    String production;
    String version;
    Rating rating;
    List<Review> reviews;

//    public Book(String name, String author, String production, String version) {
//        this.name = name;
//        this.author = author;
//        this.production = production;
//        this.version = version;
//    }

    public BookResponseDTO() {
    }

    public BookResponseDTO(int id, String name, String author, String production, String version, Rating rating, List<Review> reviews) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.production = production;
        this.version = version;
        this.rating = rating;
        this.reviews = reviews;
    }
}
