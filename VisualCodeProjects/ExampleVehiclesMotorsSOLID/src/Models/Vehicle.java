package Models;

public abstract class Vehicle {
    
    private String brand;
    private String model;
    private int year;
    private String color;
    private String licensePlate;
    private double weight;

    private Motor motor;

    public Vehicle(){

    }

    public Vehicle(String brand, String model, int year, String color, String licensePlate, double weight) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.licensePlate = licensePlate;
        this.weight = weight;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

     public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor){
        this.motor = motor;
    }

    public abstract void setVehicleOn();
    public abstract void setVehicleOff();
}
