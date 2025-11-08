package com.dxs.projects.library_backend.controller;

import com.dxs.projects.library_backend.dto.BookCreateDTO;
import com.dxs.projects.library_backend.dto.BookResponseDTO;
import com.dxs.projects.library_backend.entities.Book;
import com.dxs.projects.library_backend.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Delete mapping was not working so attempting to swithc to rest controller instead
//@Controller
//@ResponseBody
//@RequestMapping("/book")
@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookService bookService;

    // Post DTO <-> Entity mapping
    // Now the endpoints do not expose the entity directly and only expose the dto object
    // the dto object is then converted into entity when needed

    // Get all Books mapping
    @GetMapping("/getAllBooks")
    public List<BookResponseDTO> getAllBooks(){
        return bookService.getAllBooks();
    }
    // Add a Book
    @PostMapping("/addBook")
    public List<BookResponseDTO> addABook(@RequestBody BookCreateDTO bookCreateDTO){
        if(bookCreateDTO == null) return null;
        return bookService.addABook(bookCreateDTO);
    }
    // Adding a list of books
    @PostMapping("/addBooks")
    public List<BookResponseDTO> addBookList(@RequestBody List<BookCreateDTO> bookCreateDTOS){
        return bookService.addBookList(bookCreateDTOS);
    }
    // Finding Book By Id
    @GetMapping("/getById/{id}")
    public BookResponseDTO findByID(@PathVariable int id){
        return bookService.getBookByID(id);
    }
    // Updating version of an existing book by finding it by name
    @PatchMapping("/{name}/updateVersion/{version}")
    public BookResponseDTO updateVersionByName(@PathVariable String name, @PathVariable String version){
        return bookService.updateVersion(name,version);
    }
    // Getting List of Books filtered by author name. Using HQL for that
    @GetMapping("/booksByAuthorHQL/{author}")
    public List<BookResponseDTO> getBooksByAuthorName(@PathVariable String author){
        return bookService.getBooksByAuthorHQL(author);
    }

    // Getting List of books between version a - b
    @GetMapping("/getBooksBetweenVersions/{verStart}/{verEnd}")
    public List<BookResponseDTO> getBooksBwVersions(@PathVariable String verStart, @PathVariable String verEnd){
        return bookService.getBooksBetweenVersion(verStart,verEnd);
    }

    // Getting list of books uing like keyword to match books
    // -- REMEMBER: % is a special character when it comes to crafting urls. so when passing this as a parameter in url use %25
    // %25 means -> %
    @GetMapping("/getBooksByAuthorLike")
    public List<BookResponseDTO> getBooksByAuthorLike(@RequestParam String name){
        return bookService.findByAuthorLike(name);
    }

    // Delete mapping to delete a book by id
    @DeleteMapping("/DeleteaBook/{id}")
    public void deleteBook(@PathVariable int id){
        bookService.deleteABookById(id);
    }


    // *****************
    // USING JPA -- Using JPA Repository methods here to link with service and controller class

    // endpoint to get all books in the database
//    @GetMapping("/getAllBooks")
//    public List<BookResponseDTO> getAllBooks(){
//        return bookService.getAllBooks();
//    }
//    // Adding a single book entry
//    @PostMapping("/addBook")
//    public void addBook(@RequestBody Book book){
//        bookService.addBook(book);
//    }
//    // Adding list of books to the database
//    @PostMapping("/addBooks")
////    public List<Book> addListOfBooks( @RequestBody List<Book> books){
////        return bookService.addBookList(books);
////    }
//    // Finding a book by name
//    @GetMapping("/getBookByName/{name}")
//    public Book getBookByName(@PathVariable String name){
//        return bookService.getByName(name);
//    }
//    // Finding list of all books by an author
//    @GetMapping("/getBookByAuthor/{author}")
//    public List<Book> getByAuthor(@PathVariable String author){
//        return bookService.findByAuthor(author);
//    }
//    // Finding List of all the books by a production house
//    @GetMapping("/getBookByProduction/{production}")
//    public List<Book> getByProduction(@PathVariable String production){
//        return bookService.findByProduction(production);
//    }
//    // Updating a Book's version by name
//    @PostMapping("/updateBookVersion/{name}/{version}")
//    public Book updateVersionByName(@PathVariable String name, @PathVariable String version){
//        bookService.updateABookVersionByName(name,version);
//        return bookService.getByName(name);
//    }
//    // Deleting a book by name
//    @DeleteMapping("/deleteBook")
//    public void deleteBook(@RequestBody Book book){
//        bookService.deleteBook(book);
//    }
    // *****************

//    BookRepository repository;
//    BookController(BookRepository repository){
//        this.repository=repository;
//    }
//
//    List<Book> listOfBooks = new ArrayList<Book>();
//
//
//    @GetMapping("/getBooks")
//    public List<Book> getAllBooks(){
//        return repository.findAll();
////        return listOfBooks;
//    }
//
//    @PostMapping("/addNewBook")
//    public List<Book> addNewBook(@RequestBody Book book){
//        repository.save(book);
//        return repository.findAll();
//    }
//
//    @GetMapping("/searchByAuthor/{author}")
//    public List<Book> getByAuthor(@PathVariable String author){
//        return repository.findByAuthor(author);
//
//    }

    // *****************

    // Configuring JDBC to communicate between database and controllers


//    @GetMapping("/getAllBooks")
//    public List<BookResponseDTO> getAllBooks(){
//       return bookService.getAllBooks();
//    }
//
//
//    @GetMapping("/getBookById/{id}")
//    public BookResponseDTO getBookById(@PathVariable int id){
//        return bookService.getBookById(id);
//    }
//
//    @GetMapping("/getBookByAuthor/{author}")
//    public List<BookResponseDTO> getBookByAuthor(@PathVariable String author){
//        return bookService.getBookByAuthor(author);
//    }
//
//    @PostMapping("/addBook")
//    public void addBook(@RequestBody BookResponseDTO bookDTO){
//        bookService.addBook(bookDTO);
//    }

    // *****************


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
