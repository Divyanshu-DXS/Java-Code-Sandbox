package com.dxs.projects.library_backend.entities;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

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

    public Book() { }

    public Book(int id, String name, String author, String production, String version) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.production = production;
        this.version = version;
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
