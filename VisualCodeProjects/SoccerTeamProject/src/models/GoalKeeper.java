package models;

import java.text.MessageFormat;

public class GoalKeeper extends Player implements IGoalKeeper {

    public GoalKeeper() {

    }

    public GoalKeeper(String fullName, int number, String ableLeg) {
        super(fullName, number, ableLeg,"13074448888");
    }

    @Override
    public void entrenamiento() {
        System.out.println("Practice GoalKeaper");
    }

    @Override
    public void posicionDeJuego() {
        System.out.println("Position: Goal Keeper");
    }

    @Override
    public void playWithHands() {
        System.out.println(MessageFormat.format("The goal keeper {0} can play with the hands", this.getFullName()));
    }

}
