package models;

public class Defense extends Player {

    @Override
    public void entrenamiento() {
        System.out.println("Practice Defense");
    }

    @Override
    public void posicionDeJuego() {
        System.out.println("Position: Defense");
    }

}
