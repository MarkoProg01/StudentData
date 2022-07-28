package com.example.StudentData.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner runner(StudentRepository repository){
        return args -> {
            Student Marko = new Student(
                    "Marko",
                    "mm@mm.com",
                    21,
                    LocalDate.of(2001, Month.JUNE,27)
            );
            Student Jovan = new Student(
                    "jovan",
                    "jovan@mm.com",
                    22,
                    LocalDate.of(2000, Month.APRIL,13)
            );
            repository.saveAll(List.of(Marko,Jovan));
           // repository.save(Marko) <-- save only 1 student
        };
    }
}
