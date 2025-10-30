package com.dxs.projects.library_backend.repository;

import com.dxs.projects.library_backend.dto.BookDTO;
import com.dxs.projects.library_backend.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book,Long> {
    Book findByName(String name);
    List<Book> findByAuthor(String author);
    List<Book> findByProduction(String production);
}
