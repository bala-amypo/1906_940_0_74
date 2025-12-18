package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.ResponseEntity;
import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/Studentsdata")
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("/postdata")
    public ResponseEntity<Student> postdata(@Valid @RequestBody Student student){
        return new  ResponseEntity<>(studentService.saveStudent(student),HttpStatus.CREATED);
    }
    
    @GetMapping("/getdata/{id}")
    public Student getdata(@PathVariable Long id){
         return studentService.getStudentById(id);
    }
    

}