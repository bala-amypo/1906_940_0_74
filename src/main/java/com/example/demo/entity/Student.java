package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    @NotBlank(message="Name filed cannot be empty")
    @Size(min=3,max=20,message="The user name must be min of 3 and max of 20 character")
    private String name;
    private String email;
    
    
    public void setId(Long id){
        this.id=id;

    }
    public Long getId() {
        return id;
        
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
    public Student(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
       
    }
    public Student() {
    }


}