package models;

public class GoalKeeper extends Player {

    @Override
    public void entrenamiento() {
        System.out.println("Practice GoalKeaper");
    }

    @Override
    public void posicionDeJuego() {
        System.out.println("Position: Goal Keeper");
    }

}
