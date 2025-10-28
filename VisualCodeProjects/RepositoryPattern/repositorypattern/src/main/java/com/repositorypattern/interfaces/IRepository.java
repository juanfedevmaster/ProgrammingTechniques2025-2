package com.repositorypattern.interfaces;

import java.util.List;

import com.repositorypattern.entities.Person;

public interface IRepository {
    void savePerson(Person p);
    List<Person> findAll();
}
