package com.dxs.projects.library_backend.repository;

import com.dxs.projects.library_backend.dto.BookCreateDTO;
import com.dxs.projects.library_backend.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookRepository extends JpaRepository<Book,Long> {
    Book findByName(String name);
    List<Book> findByAuthor(String author);
    List<Book> findByProduction(String production);
    Book findById(int id);

    // HQL - JPQL
    @Query(nativeQuery = true, value = "SELECT * FROM BOOK_DATABASE where author = :author")
    List<Book> gatherListByAuthor(String author);


}
