package com.dxs.projects.library_backend.service;

import com.dxs.projects.library_backend.dto.BookDTO;
import com.dxs.projects.library_backend.entities.Book;
import com.dxs.projects.library_backend.repository.BookRepoJDBC;
import com.dxs.projects.library_backend.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
//    BookRepoJDBC bookRepoJDBC;
    BookRepository bookRepository;

//    public List<BookDTO> getAllBooks(){
//        return bookRepoJDBC.getAllBooks();
//    }
//
//    public BookDTO getBookById(int id) {
//        return bookRepoJDBC.getBookById(id);
//    }
//
//    public List<BookDTO> getBookByAuthor(String author) {
//        return bookRepoJDBC.getBookByAuthor(author);
//    }
//
//    public void addBook(BookDTO bookDTO){
//        bookRepoJDBC.addBook(bookDTO);
//    }

    // Using JPA from here On ...
    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }

    public void addBook(Book book){
        bookRepository.save(book);
    }
}
