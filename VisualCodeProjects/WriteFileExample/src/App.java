import java.util.ArrayList;
import java.util.List;

import Entities.Persona;
import Persistence.PersonaRepository;

public class App {
    public static void main(String[] args) throws Exception {
        var persona = new Persona("Juan Felipe", "Quintana", 39, "juan.quintanag@udea.edu.co", "3001112233",
                "Calle 45 sur #14-78", 185);

        var persona2 = new Persona("Laura Melissa", "Quintana", 39, "lau.quintanag@udea.edu.co", "3001112234",
                "Calle 45 sur #14-78", 180);

        List<Persona> personas = new ArrayList<>();
        personas.add(persona);
        personas.add(persona2);

        var personaRepository = new PersonaRepository();
        var saveFlag = personaRepository.savePersona(personas);
        
        if (saveFlag) {
            System.out.println("The person is saved");
        }

    }
}
