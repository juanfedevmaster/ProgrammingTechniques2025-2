package org.vehiculeprojectgroup.model;

public class Motor {
    private double cylinder;
    private double amountCylinder;
    private String positionCylinders;
    private String brand;
    private String combustionType;

    public Motor(double cylinder, double amountCylinder, String positionCylinders, String brand) {
        this.cylinder = cylinder;
        this.amountCylinder = amountCylinder;
        this.positionCylinders = positionCylinders;
        this.brand = brand;
    }

    public Motor(double cylinder) {

    }


    public double getCylinder() {
        return cylinder;
    }

    public void setCylinder(double cylinder) {
        this.cylinder = cylinder;
    }

    public double getAmountCylinder() {
        return amountCylinder;
    }

    public void setAmountCylinder(double amountCylinder) {
        this.amountCylinder = amountCylinder;
    }

    public String getPositionCylinders() {
        return positionCylinders;
    }

    public void setPositionCylinders(String positionCylinders) {
        this.positionCylinders = positionCylinders;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCombustionType() {
        return combustionType;
    }

    public void setCombustionType(String combustionType) {
        this.combustionType = combustionType;
    }
}
