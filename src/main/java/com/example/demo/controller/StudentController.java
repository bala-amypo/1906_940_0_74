package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;


    @PostMapping("/postdata")
    public ResponseEntity<Student> postdata(@Valid @RequestBody Student student){
        return new ResponseEntity<>(studentService.saveStudent(student));
    }
    
}