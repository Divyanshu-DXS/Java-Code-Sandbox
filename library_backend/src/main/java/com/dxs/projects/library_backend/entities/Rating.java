package com.dxs.projects.library_backend.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.util.Scanner;

@Entity
@Data
@Builder
public class Rating {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer ratingID;
    Integer rating;

    public Rating() {
    }

    public Rating(Integer ratingID, Integer rating) {
        this.ratingID = ratingID;
        this.rating = rating;
    }

    public Integer getRatingID() {
        return ratingID;
    }

    public void setRatingID(Integer ratingID) {
        this.ratingID = ratingID;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }
}
