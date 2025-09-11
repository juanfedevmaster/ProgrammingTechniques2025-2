package models;

import java.text.MessageFormat;
import java.util.UUID;

public abstract class Player {
    private String fullName;
    private int number;
    private String ableLeg;
    private final String id;

    // Constructor por defecto
    public Player() {
        UUID newUuid = UUID.randomUUID();
        this.id = newUuid.toString();
    }

    // Constructor con todos los parámetros
    public Player(String fullName, int number, String ableLeg, String id) {
        this.fullName = fullName;
        this.number = number;
        this.ableLeg = ableLeg;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getAbleLeg() {
        return ableLeg;
    }

    public void setAbleLeg(String ableLeg) {
        this.ableLeg = ableLeg;
    }

    public void getPosition() {
        if (ableLeg.equals("Diestro")) {
            System.out.println(
                    MessageFormat.format(
                        "The position of the player {0} is for Right band",
                        this.getFullName()));
            return;
        }

         System.out.println(
                    MessageFormat.format(
                        "The position of the player {0} is for Left band",
                        this.getFullName()));
    }

    public abstract void entrenamiento();

    public abstract void posicionDeJuego();
}
