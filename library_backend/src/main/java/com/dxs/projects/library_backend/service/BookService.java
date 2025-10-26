package com.dxs.projects.library_backend.service;

import com.dxs.projects.library_backend.dto.Book;
import com.dxs.projects.library_backend.repository.BookRepoJDBC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    BookRepoJDBC bookRepoJDBC;

    public List<Book> getAllBooks(){
        return bookRepoJDBC.getAllBooks();
    }
}
