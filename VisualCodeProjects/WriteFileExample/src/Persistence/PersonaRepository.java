package Persistence;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;

import Entities.Persona;

/**
 * Repositorio para la persistencia de datos de objetos Persona en el sistema de archivos.
 * Implementa el patrón Repository para separar la lógica de acceso a datos del resto de la aplicación.
 * 
 * Esta clase proporciona funcionalidad para guardar objetos Persona en un archivo de texto,
 * ya sea individualmente o en lotes (lista de personas).
 * 
 * @author GitHub Copilot
 * @version 1.0
 */
public class PersonaRepository {
    
    /**
     * Guarda una sola persona en el archivo de texto "Personas.txt".
     * 
     * @param persona El objeto persona que se desea guardar
     * @return true si la operación fue exitosa, false en caso de error
     * 
     * Funcionamiento:
     * 1. Obtiene el texto formateado de la persona usando formatToSave()
     * 2. Define la ruta del archivo como "Personas.txt"
     * 3. Crea el archivo si no existe
     * 4. Abre el archivo en modo append (agregar al final)
     * 5. Escribe la información de la persona
     * 6. Cierra el archivo
     * 7. Maneja excepciones y retorna el estado de la operación
     */
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

    /**
     * Guarda múltiples personas en el archivo de texto en una sola operación.
     * 
     * @param personas Lista de objetos persona que se desean guardar
     * @return true si la operación fue exitosa, false en caso de error
     * 
     * Funcionamiento:
     * 1. Define la ruta del archivo como "Personas.txt"
     * 2. Crea el archivo si no existe
     * 3. Abre el archivo en modo append
     * 4. Itera sobre la lista de personas
     * 5. Para cada persona, obtiene su texto formateado y lo escribe
     * 6. Cierra el archivo
     * 7. Maneja excepciones y retorna el estado de la operación
     * 
     * Características técnicas:
     * - Utiliza File, FileWriter y PrintWriter para operaciones de E/S
     * - Crea automáticamente el archivo si no existe
     * - Modo append para preservar datos existentes
     * - Try-catch genérico para capturar excepciones
     * - Imprime mensajes de error en consola
     * 
     * Consideraciones de mejora:
     * - Falta el uso de try-with-resources para cerrar automáticamente los streams
     * - La ruta "Personas.txt" está hardcodeada, debería ser configurable
     * - Manejo de excepciones muy genérico, podría ser más específico
     */
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
