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
    // Get list of all the books in the database
    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }
    // Add a single book entry
    public void addBook(Book book){
        bookRepository.save(book);
    }
    // Add a list of books
    public List<Book> addBookList(List<Book> books){
        bookRepository.saveAll(books);
        return getAllBooks();
    }
    // Find a book by name
    public Book getByName(String name){
        return bookRepository.findByName(name);
    }
    // List all books by an author
    public List<Book> findByAuthor(String author){
        return bookRepository.findByAuthor(author);
    }
    // List all books by production
    public List<Book> findByProduction(String production){
        return bookRepository.findByProduction(production);
    }
    // Update a book version

    // Delete a book entry

}
