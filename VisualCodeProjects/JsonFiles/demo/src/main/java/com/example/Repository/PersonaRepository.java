package com.example.Repository;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import com.example.Entities.Persona;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class PersonaRepository {
    private final Gson _gson;

    public PersonaRepository() {
        this._gson = new GsonBuilder().setPrettyPrinting().create();;
    }

    public boolean savePersonas(List<Persona> lstPersonas) {
        try {
            FileWriter file = new FileWriter("personas.json");
            var jsonToSave = _gson.toJsonTree(lstPersonas);
            _gson.toJson(jsonToSave, file);
            file.close();
            return true;
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            return false;
        }
    }

    public List<Persona> readJsonPersonas() {
        try {
            Reader reader = new FileReader("personas.json");
            List<Persona> personas = _gson.fromJson(reader,
                    new TypeToken<ArrayList<Persona>>() {
                    }.getType());
            return personas;

        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            return null;
        }
    }
}
