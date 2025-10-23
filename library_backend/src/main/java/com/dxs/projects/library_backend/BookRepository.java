package com.dxs.projects.library_backend;

import com.dxs.projects.library_backend.dto.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book,Long> {
    List<Book> findByAuthor(String author);
}
