package Persistence;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;

import Entities.Persona;

public class PersonaRepository {
    public boolean savePersona(Persona persona) {
        var textToSave = persona.formatToSave();
        var path = "Personas.txt";

        try {

            File file = new File(path);
            if (!file.exists()) {
                file.createNewFile();
            }

            var fileWriter = new FileWriter(path, true);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            printWriter.println(textToSave);
            fileWriter.close();

        } catch (Exception exe) {
            System.out.println(exe.getMessage());
            return false;
        }
        return true;
    }

    public boolean savePersona(List<Persona> personas) {
        var path = "Personas.txt";

        try {

            File file = new File(path);
            if (!file.exists()) {
                file.createNewFile();
            }

            var fileWriter = new FileWriter(path, true);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            for (Persona persona : personas) {
                var textToSave = persona.formatToSave();
                printWriter.println(textToSave);
            }

            fileWriter.close();

        } catch (Exception exe) {
            System.out.println(exe.getMessage());
            return false;
        }
        return true;
    }
}
