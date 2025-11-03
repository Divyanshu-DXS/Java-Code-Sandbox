package com.dxs.projects.library_backend.dto;

import com.dxs.projects.library_backend.entities.Rating;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Builder
@Getter @Setter
public class BookCreateDTO {

    String name ;
    String author;
    String production;
    String version;
    Rating rating;
}
