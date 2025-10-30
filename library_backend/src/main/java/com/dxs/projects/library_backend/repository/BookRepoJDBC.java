package com.dxs.projects.library_backend.repository;

import com.dxs.projects.library_backend.constants.SQLConstants;
import com.dxs.projects.library_backend.dto.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class BookRepoJDBC {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<BookDTO> getAllBooks(){
        RowMapper rowMapper = new RowMapper() {

            @Override
            public BookDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
                BookDTO bookDTO = new BookDTO();
                bookDTO.setId(rs.getInt("id"));
                bookDTO.setName(rs.getString("name"));
                bookDTO.setAuthor(rs.getString("author"));
                bookDTO.setProduction(rs.getString("production"));
                bookDTO.setVersion(rs.getString("version"));
                return bookDTO;
            }
        };
        return jdbcTemplate.query(SQLConstants.ALL_BOOK_FETCH,rowMapper);
    }

    public BookDTO getBookById(int id) {
        Optional<BookDTO> optionalbook = getAllBooks().stream().filter(book1 -> book1.getId()==id).findFirst();
        BookDTO bookDTO = optionalbook.orElse(null);
        return bookDTO;
    }

    public List<BookDTO> getBookByAuthor(String author) {
        return getAllBooks().stream().filter(book->book.getAuthor().equalsIgnoreCase(author)).collect(Collectors.toList());
    }

    public void addBook(BookDTO bookDTO){

        jdbcTemplate.update(SQLConstants.ADD_BOOK,
                            bookDTO.getId(),
                            bookDTO.getName(),
                            bookDTO.getAuthor(),
                            bookDTO.getProduction(),
                            bookDTO.getVersion());

            }



}
