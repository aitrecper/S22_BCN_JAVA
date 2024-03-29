package com.ejemplo.demo;

public class Persona {
    private String name;
    private String surname;
    private int age;

    public Persona() { }
    public Persona(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Persona{" + "name=" + name + ", surname=" + surname + ", age=" + age + '}';
    }

    public String toJson() {
        return "{\"name\":\"" + name + "\", \"surname\":\"" + surname + "\", \"age\":\"" + age + "\"}";
    }
}
