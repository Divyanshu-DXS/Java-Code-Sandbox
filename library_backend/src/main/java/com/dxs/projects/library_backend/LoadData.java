package com.dxs.projects.library_backend;

import com.dxs.projects.library_backend.dto.Book;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadData {

    private static  final Logger log = LoggerFactory.getLogger(LoadData.class);

    @Bean
    CommandLineRunner initDatabase(BookRepository repository){
        return args -> {
            log.info("Preloading " + repository.save(new Book("The rise of a new Era", "Dev","DXS Production","1.0")));
            log.info("Preloading " + repository.save(new Book("The Tech Worlds Underdog", "Divyanshu","DXS Productions","2.0")));
        };
    }

}
