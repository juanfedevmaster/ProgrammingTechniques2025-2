package com.repositorypattern.services;

import com.repositorypattern.entities.Person;
import com.repositorypattern.interfaces.IRepository;
import com.repositorypattern.persistance.LogsRepository;
import com.repositorypattern.persistance.PersonRepository;

public class PersonService {
    public void savePerson(Person p) {
        IRepository repoLog = new LogsRepository();
        IRepository repoPerson = new PersonRepository();

        var messageError = "";

        if (p.getId() <= 0) {
            messageError += "Missing the Id";
        }

        if (p.getEmail().isBlank() || p.getEmail().trim().isEmpty() || !p.getEmail().trim().contains("@")) {
            if (!messageError.isEmpty())
                messageError += ",";
            messageError += "Missing the email";
        }

        if (p.getName().isBlank() || p.getName().trim().isEmpty()) {
            if (!messageError.isEmpty())
                messageError += ",";
            messageError += "Missing the name";
        }

        if (p.getAge() <= 0) {
            if (!messageError.isEmpty())
                messageError += ",";
            messageError += "Missing the age";
        }

        if (!messageError.isEmpty()) {
            p.setErrors(messageError);
            repoLog.savePerson(p);
            return;
        }

        repoPerson.savePerson(p);
    }
}
