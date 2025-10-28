package com.repositorypattern.persistance;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;

import com.repositorypattern.entities.Person;
import com.repositorypattern.interfaces.IRepository;

public class LogsRepository implements IRepository {

    @Override
    public void savePerson(Person person) {
        var path = "PersonLog.txt";

        try {

            File file = new File(path);
            if (!file.exists()) {
                file.createNewFile();
            }

            var fileWriter = new FileWriter(path, true);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            var textToSave = person.formatToSave();
            printWriter.println(textToSave);
            
            fileWriter.close();

        } catch (Exception exe) {
            System.out.println(exe.getMessage());
        }
    }

    @Override
    public List<Person> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }
}
