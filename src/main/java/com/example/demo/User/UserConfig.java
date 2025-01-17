package com.example.demo.User;

import org.apache.catalina.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class UserConfig {

    @Bean
    CommandLineRunner commandLineRunner(UserRepository repository){
        return args -> {
            Users mariam = new Users(
                    "Mariam",
                    21,
                    "mariam@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 5)
            );

            Users Nial = new Users(
                    "Nial",
                    21,
                    "Nial@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 5)
            );

            repository.saveAll(
                    List.of(mariam, Nial)
            );
        };
    }
}
