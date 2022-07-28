package com.example.StudentData.Student;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service //@Service i @Controller su isti
public class StudentService {

    public List<Student> getStudent(){
        return List.of(
                new Student(1L,
                        "Marko",
                        "mm@mm.com",
                        21,
                        LocalDate.of(2001,06,27))
        );
    }
}
