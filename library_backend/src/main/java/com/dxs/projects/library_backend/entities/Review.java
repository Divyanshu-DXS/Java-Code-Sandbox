package com.dxs.projects.library_backend.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer ReviewId;
    String Review;
    Integer rating;

    public Integer getReviewId() {
        return ReviewId;
    }

    public void setReviewId(Integer reviewId) {
        ReviewId = reviewId;
    }

    public String getReview() {
        return Review;
    }

    public void setReview(String review) {
        Review = review;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }
}
