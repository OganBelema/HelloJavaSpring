package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student belema = new Student(
                    "Belema",
                    "lovelife@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 5)
            );

            Student marian = new Student(
                   "Marian",
                   "marian@gmail.com",
                   LocalDate.of(1998, Month.JUNE, 15)
            );

            studentRepository.saveAll(
                    List.of(belema, marian)
            );
        };
    }
}
