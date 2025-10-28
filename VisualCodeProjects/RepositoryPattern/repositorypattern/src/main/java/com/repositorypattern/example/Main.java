package com.repositorypattern.example;

import com.repositorypattern.entities.Person;
import com.repositorypattern.services.PersonService;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person(1,"","juan.quintanag@udea.edu.co",-1);
        Person p2 = new Person(2,"Camilo Andres","camilo.rodriguez@udea.edu.co",35);

        PersonService service = new PersonService();

        service.savePerson(p1);
        service.savePerson(p2);
    }
}