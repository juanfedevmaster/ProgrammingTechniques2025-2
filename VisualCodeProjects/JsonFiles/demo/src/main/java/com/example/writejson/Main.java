package com.example.writejson;

import java.util.ArrayList;
import java.util.List;

import com.example.Entities.Persona;
import com.example.Repository.PersonaRepository;
import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        PersonaRepository repo = new PersonaRepository();

        var persona = new Persona("Juan Felipe", "Quintana", 39, "juan.quintanag@udea.edu.co", "3001112233",
                "Calle 45 sur #14-78", 185);

        var persona2 = new Persona("Laura Melissa", "Quintana", 39, "lau.quintanag@udea.edu.co", "3001112234",
                "Calle 45 sur #14-78", 180);

        var persona3 = new Persona("Jhon", "Doe", 41, "jhon.doe@udea.edu.co", "0000000000",
                "Calle 45 sur #14-78", 185);
        var persona4 = new Persona("Jane", "Doe", 30, "jane.doe@udea.edu.co", "0000000000",
                "Calle 45 sur #14-78", 185);

        List<Persona> personas = new ArrayList<>();
        personas.add(persona);
        personas.add(persona2);

        var savePersonas = repo.savePersonas(personas);

        if (savePersonas == true) {
            System.out.println("The people is saved into the Json File");
        }

        var result = repo.readJsonPersonas();

        for (Persona itemPersona : result) {
            System.out.println(itemPersona);
        }

        System.out.println("===============================================");

        result.add(persona3);
        result.add(persona4);

        savePersonas = repo.savePersonas(result);

        if (savePersonas == true) {
            System.out.println("The people is saved into the Json File");
        }

        result = repo.readJsonPersonas();
        for (Persona itemPersona : result) {
            System.out.println(itemPersona);
        }

    }
}