package com.dxs.projects.library_backend.repository;

import com.dxs.projects.library_backend.dto.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class BookRepoJDBC {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Book> getAllBooks(){
        RowMapper rowMapper = new RowMapper() {
            Book book = new Book();
            @Override
            public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
                book.setId(rs.getInt("id"));
                book.setName(rs.getString("name"));
                book.setAuthor(rs.getString("author"));
                book.setProduction(rs.getString("production"));
                book.setVersion(rs.getString("version"));
                return book;
            }
        };
        return jdbcTemplate.query("SELECT * FROM BOOK",rowMapper);
    }


}
