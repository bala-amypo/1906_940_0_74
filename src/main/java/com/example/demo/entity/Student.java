package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import jakarta.persistence.Column;
@Entity
// @Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message="Name filed cannot be empty")
    @Size(min=3,max=20,message="The user name must be min of 3 and max of 20 character")
    private String name;
    @Email(message="Invalid email id")
    @Column(unique=true)
    private String email;

    // @NotNull
    // @Size(min,max)
    // @Min
    // @Max
    // @Pattern(reg)
    // @Postive

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Student(String name,String email) {
        this.name = name;
        this.email = email;
    }

    public Student() {
    }
    

    
}