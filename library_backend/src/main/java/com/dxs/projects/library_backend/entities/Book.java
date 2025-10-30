package com.dxs.projects.library_backend.entities;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
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

    public Book() {
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", production='" + production + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}
