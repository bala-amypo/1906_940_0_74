package com.example.aiml.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.aiml.entity.Student;
import com.example.aiml.service.StudentService;

@Controller
public class StudentController {
    @Autowired
    StudentService studentService;
    @PostMapping("/postdata")
    public Student postdata(@RequestBody Student student){
        return studentService.saveStudent(student);
    }
    
}