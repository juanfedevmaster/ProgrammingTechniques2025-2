package com.repositorypattern.entities;

public class Person {
    private int id;
    private String name;
    private String email;
    private int age;
    private String errors;
    
    // Constructor por defecto
    public Person() {
    }
    
    // Constructor con parámetros
    public Person(int id, String name, String email, int age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
    }
    
    // Constructor sin ID para nuevas instancias
    public Person(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }
    
    // Getters
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public String getEmail() {
        return email;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getErrors(){
        return this.errors;
    }
    // Setters
    public void setId(int id) {
        this.id = id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setAge(int age) {
        this.age = age;
    }

    public void setErrors(String errors){
        this.errors = errors;
    }
    
    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }

     public String formatToSave() {
        var format = this.name + "|" + this.email + "|" + this.age + "|" + this.id + "|" + this.errors;
        return format;
    }
}
