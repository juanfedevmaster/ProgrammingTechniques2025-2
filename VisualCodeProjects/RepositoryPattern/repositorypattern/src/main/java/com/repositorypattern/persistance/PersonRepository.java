package com.repositorypattern.persistance;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.repositorypattern.entities.Person;
import com.repositorypattern.interfaces.IRepository;

public class PersonRepository implements IRepository{
      private final Gson _gson;

    public PersonRepository() {
        this._gson = new GsonBuilder().setPrettyPrinting().create();;
    }

    @Override
    public void savePerson(Person person) {
        try {
            List<Person> people = findAll();
            if(people == null)
                people = new ArrayList<>();

            people.add(person);
            FileWriter file = new FileWriter("Person.json");
            var jsonToSave = _gson.toJsonTree(people);
            _gson.toJson(jsonToSave, file);
            file.close();
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

    @Override
    public List<Person> findAll() {
        try {
            Reader reader = new FileReader("Person.json");
            List<Person> people = _gson.fromJson(reader,
                    new TypeToken<ArrayList<Person>>() {
                    }.getType());
            return people;

        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            return null;
        }
    }
}
