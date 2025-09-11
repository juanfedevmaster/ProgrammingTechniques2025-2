package org.vehiculeprojectgroup.model;

public class Vehicule {
    private IMotor motor;
    private String brand;
    private int amoutDoors;
    private String model;
    private int year;

    public Vehicule() {
    }

    public Vehicule(IMotor motor, String brand, int amoutDoors, String model, int year) {
        this.motor = motor;
        this.brand = brand;
        this.amoutDoors = amoutDoors;
        this.model = model;
        this.year = year;
    }

    public IMotor getMotor() {
        return motor;
    }

    public void setMotor(IMotor motor) {
        this.motor = motor;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getAmoutDoors() {
        return amoutDoors;
    }

    public void setAmoutDoors(int amoutDoors) {
        this.amoutDoors = amoutDoors;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
