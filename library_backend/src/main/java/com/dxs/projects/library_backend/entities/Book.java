package com.dxs.projects.library_backend.entities;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Entity
@Data
@Builder
@Table(name = "BOOK_DATABASE")
public class Book {
    @Id
    @Column (name = "Book_ID") @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
    @Column (name ="Book_name", length = 70, nullable = false)
    String name ;
    @Column
    String author;
    @Column(nullable = false)
    String production;
    @Column
    String version;
    @OneToOne
    Rating rating;
    @OneToMany
    List<Review> reviewList;

    public List<Review> getReviewList() {
        return reviewList;
    }

    public void setReviewList(List<Review> reviewList) {
        this.reviewList = reviewList;
    }

    public Book() { }

    public Rating getRating() {
        int rate=0;
        for (Review review: reviewList) {
            rate+= review.getRating();
        }
        rating.setRating(rate/reviewList.size());
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public Book(int id, String name, String author, String production, String version, Rating rating, List<Review> reviewList) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.production = production;
        this.version = version;
        this.rating = rating;
        this.reviewList = reviewList;
    }

}
