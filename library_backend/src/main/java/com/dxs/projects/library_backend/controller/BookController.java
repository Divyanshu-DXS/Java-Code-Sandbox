package com.dxs.projects.library_backend.controller;

import com.dxs.projects.library_backend.BookRepository;
import com.dxs.projects.library_backend.dto.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Delete mapping was not working so attempting to swithc to rest controller instead
//@Controller
//@ResponseBody
//@RequestMapping("/book")
@RestController
//@RequestMapping("/book")
public class BookController {

    BookRepository repository;
    BookController(BookRepository repository){
        this.repository=repository;
    }
    
    List<Book> listOfBooks = new ArrayList<Book>();


    @GetMapping("/getBooks")
    public List<Book> getAllBooks(){
        return repository.findAll();
//        return listOfBooks;
    }

    @PostMapping("/addNewBook")
    public List<Book> addNewBook(@RequestBody Book book){
        repository.save(book);
        return repository.findAll();
    }

    @GetMapping("/searchByAuthor/{author}")
    public List<Book> getByAuthor(@PathVariable String author){
        return repository.findByAuthor(author);

    }


    // < ! -- Before adding JPA repository. restructuring pending  -- >
    // Using request body to provide list of books to add
//    @PostMapping("/addBooks")
//    public List<Book> addBookSet(@RequestBody List<Book> book){
//        listOfBooks.addAll(book);
//        return listOfBooks;
//    }
//
//    // using Query parameters
//    @GetMapping("/getByName")
//    public List<Book> getBookByName(@RequestParam String name){
//        return listOfBooks.stream().filter(book -> book.getName().equals(name)).collect(Collectors.toList());
//    }
//
//    // using query parameters
//    @GetMapping("/getByAuthor/{author}")
//    public List<Book> getBookByAuthor(@PathVariable String author){
//        return listOfBooks.stream().filter(book -> book.getAuthor().equalsIgnoreCase(author)).collect(Collectors.toList());
//    }
//
//    // Using request params
//    @DeleteMapping("/deleteABook/{name}")
//    public List<Book> deleteBookByName(@PathVariable String name){
//        listOfBooks.removeAll(listOfBooks.stream().filter(book -> book.getName().equals(name)).collect(Collectors.toList()));
//        System.out.println("Book has been removed ! ");
//        return listOfBooks;
//    }


}
