package com.ejemplo.demo;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class User implements Serializable{
    private static final long serialVersionUID = 1L;


    //Atributes
    private Long id;
    private String name;
    private String surname;

    //Constructors
//    public User() {}
//
//    public User(Long id, String name, String surname) {
//        this.id = id;
//        this.name = name;
//        this.surname = surname;
//    }
    // Getters & Setters
//    public Long getId() {
//        return id;
//    }
//    public void setId(Long id) {
//        this.id = id;
//    }
//    public String getName() {
//        return name;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }
//    public String getSurname() {
//        return surname;
//    }
//    public void setSurname(String surname) {
//        this.surname = surname;
//    }
}