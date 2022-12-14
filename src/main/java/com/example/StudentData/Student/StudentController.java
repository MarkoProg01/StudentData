package com.example.StudentData.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    private final StudentService studentService;
    @Autowired
    public StudentController(StudentService studentService) { //Kada se doda @Component u StudentService,skloni se error
        this.studentService = new StudentService();
    }

    @GetMapping
    public List<Student> getStudent(){
        return studentService.getStudent();
    }

}
