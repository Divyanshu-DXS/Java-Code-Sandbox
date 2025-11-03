package com.dxs.projects.library_backend.mapper;

import com.dxs.projects.library_backend.dto.BookCreateDTO;
import com.dxs.projects.library_backend.dto.BookResponseDTO;
import com.dxs.projects.library_backend.entities.Book;
import lombok.Builder;


public class BookMapper {

    public static Book toEntity(BookCreateDTO dto) {
        if (dto == null) return null;
        return Book.builder()
                .name(dto.getName())
                .author(dto.getAuthor())
                .production(dto.getProduction())
                .version(dto.getVersion())
                .rating(dto.getRating())
                .build();
    }

    public static BookResponseDTO toResponseDTO(Book entity){
        if(entity==null) return null;

        return BookResponseDTO.builder()
                .id(entity.getId())
                .name(entity.getName())
                .author(entity.getAuthor())
                .production(entity.getProduction())
                .version(entity.getVersion())
                .rating(entity.getRating())
                .build();
    }
}
