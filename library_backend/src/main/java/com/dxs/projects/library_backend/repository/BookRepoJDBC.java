package com.dxs.projects.library_backend.repository;

import com.dxs.projects.library_backend.constants.SQLConstants;
import com.dxs.projects.library_backend.dto.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class BookRepoJDBC {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Book> getAllBooks(){
        RowMapper rowMapper = new RowMapper() {

            @Override
            public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
                Book book = new Book();
                book.setId(rs.getInt("id"));
                book.setName(rs.getString("name"));
                book.setAuthor(rs.getString("author"));
                book.setProduction(rs.getString("production"));
                book.setVersion(rs.getString("version"));
                return book;
            }
        };
        return jdbcTemplate.query(SQLConstants.ALL_BOOK_FETCH,rowMapper);
    }

    public Book getBookById(int id) {
        Optional<Book> optionalbook = getAllBooks().stream().filter(book1 -> book1.getId()==id).findFirst();
        Book book = optionalbook.orElse(null);
        return book;
    }

    public List<Book> getBookByAuthor(String author) {
        return getAllBooks().stream().filter(book->book.getAuthor().equalsIgnoreCase(author)).collect(Collectors.toList());
    }

    public void addBook(Book book){

        jdbcTemplate.update(SQLConstants.ADD_BOOK,
                            book.getId(),
                            book.getName(),
                            book.getAuthor(),
                            book.getProduction(),
                            book.getVersion());

            }



}
