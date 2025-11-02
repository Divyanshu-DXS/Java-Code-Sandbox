package com.dxs.projects.library_backend.service;

import com.dxs.projects.library_backend.dto.BookCreateDTO;
import com.dxs.projects.library_backend.dto.BookResponseDTO;
import com.dxs.projects.library_backend.entities.Book;
//import com.dxs.projects.library_backend.repository.BookRepoJDBC;
import com.dxs.projects.library_backend.mapper.BookMapper;
import com.dxs.projects.library_backend.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookService {
    @Autowired
//    BookRepoJDBC bookRepoJDBC;
    BookRepository bookRepository;

    // Post DTO Entity Mapping with converter redefining services below

    // Get All Books
    public List<BookResponseDTO> getAllBooks(){
        return bookRepository.findAll().stream().map(book -> {return BookMapper.toResponseDTO(book);}).collect(Collectors.toList());
    }

    // Add a book
    public List<BookResponseDTO> addABook(BookCreateDTO bookCreateDTO){
        Book entity = BookMapper.toEntity(bookCreateDTO);
        Book saved = bookRepository.save(entity);
        return bookRepository.findAll().stream().map(BookMapper::toResponseDTO).collect(Collectors.toList());
    }

    // Adding a List of Books
    public List<BookResponseDTO> addBookList(List<BookCreateDTO> bookCreateDTOS){
        List<Book> books = new ArrayList<>();
        for (BookCreateDTO bookCreateDTO : bookCreateDTOS) {
            books.add(BookMapper.toEntity(bookCreateDTO));
        }
        bookRepository.saveAll(books);
        return bookRepository.findAll().stream().map(BookMapper::toResponseDTO).collect(Collectors.toList());
    }

//      ****************** Without using dto and entity mapping below ******************
//    public List<BookResponseDTO> getAllBooks(){
//        return bookRepoJDBC.getAllBooks();
//    }
//
//    public BookResponseDTO getBookById(int id) {
//        return bookRepoJDBC.getBookById(id);
//    }
//
//    public List<BookResponseDTO> getBookByAuthor(String author) {
//        return bookRepoJDBC.getBookByAuthor(author);
//    }
//
//    public void addBook(BookResponseDTO bookDTO){
//        bookRepoJDBC.addBook(bookDTO);
//    }

    // Using JPA from here On ...
    // Get list of all the books in the database
//    public List<Book> getAllBooks(){
//        return bookRepository.findAll();
//    }

    // Add a single book entry
//    public void addBook(Book book){
//        bookRepository.save(book);
//    }
//    // Add a list of books
////    public List<Book> addBookList(List<Book> books){
////        bookRepository.saveAll(books);
////        return getAllBooks();
////    }
//    // Find a book by name
//    public Book getByName(String name){
//        return bookRepository.findByName(name);
//    }
//    // List all books by an author
//    public List<Book> findByAuthor(String author){
//        return bookRepository.findByAuthor(author);
//    }
//    // List all books by production
//    public List<Book> findByProduction(String production){
//        return bookRepository.findByProduction(production);
//    }
//    // Update a book version
//    public Book updateABookVersionByName(String name, String version){
//        bookRepository.findByName(name).setVersion(version);
//        return bookRepository.findByName(name);
//    }
//    // Delete a book entry by name
//    public void deleteBook(Book book){
//        bookRepository.delete(book);
//    }




}
