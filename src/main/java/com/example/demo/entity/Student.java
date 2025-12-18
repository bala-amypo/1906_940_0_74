package com.example.demo.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
//import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
//@Table(name="StudentTable")
public class Student {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    

    private int id;
    @NotBlank(message="Name filed cannot be empty")
    @Size(min=3,max=20,message="The user name must be min of 3 and max of 20 character")
    private String name;
    @Email(message="Invalid email Id")
    @Column(unique=true)
    private String email;
   
    
    //@NotNull
    //Size(min,max)
    //@Min
    //@Max
    //@Pattern(reg)
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
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
    public Student(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;

    }
    public Student() {
    }
    

}