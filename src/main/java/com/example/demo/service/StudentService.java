package com.example.demo.service;

import com.example.demo.entity.Student;

public interface StudentService {

    Student saveStudent(Student student);
    Student getStudentById(Long id);
}