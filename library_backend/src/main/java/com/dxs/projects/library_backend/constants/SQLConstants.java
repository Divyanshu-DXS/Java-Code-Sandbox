package com.dxs.projects.library_backend.constants;

public interface SQLConstants {
    String ALL_BOOK_FETCH = "SELECT * FROM BOOK";
    String ADD_BOOK =" INSERT INTO BOOK(id,name,author,production,version) VALUES(?,?,?,?, ?)";
}
