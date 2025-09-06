package models;

public abstract class Player {
    private String fullName;
    private int number;
    private String ableLeg;

    // Constructor por defecto
    public Player() {
    }

    // Constructor con todos los parámetros
    public Player(String fullName, int number, String ableLeg) {
        this.fullName = fullName;
        this.number = number;
        this.ableLeg = ableLeg;
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

    public abstract void entrenamiento();
    public abstract void posicionDeJuego();
}
