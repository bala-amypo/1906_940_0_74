package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Student;

public interface StudentRespository extends JpaRepository<Student,Long> {
    
    }