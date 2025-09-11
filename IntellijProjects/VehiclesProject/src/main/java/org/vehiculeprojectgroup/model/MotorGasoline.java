package org.vehiculeprojectgroup.model;

import java.text.MessageFormat;

public class MotorGasoline extends Motor implements IMotor{

    private String typeTurnOnOff;

    public MotorGasoline(double cylinder, double amountCylinder, String positionCylinders, String brand, String typeTurnOnOff) {
        super(cylinder, amountCylinder, positionCylinders, brand);
        this.typeTurnOnOff = typeTurnOnOff;
    }

    public MotorGasoline(double cylinder, String typeTurnOnOff) {
        super(cylinder);
        this.typeTurnOnOff = typeTurnOnOff;
    }

    public String getTypeTurnOnOff() {
        return typeTurnOnOff;
    }

    public void setTypeTurnOnOff(String typeTurnOnOff) {
        this.typeTurnOnOff = typeTurnOnOff;
    }

    @Override
    public void turnOn() {
        switch (this.typeTurnOnOff){
            case "button":
                System.out.println(MessageFormat.format("{0} - Turn on Gasoline motor by button",this.getBrand()));
                break;
            case "command":
                System.out.println(MessageFormat.format("{0} - Turn on Gasoline motor by command",this.getBrand()));
                break;
            case "commandInHand":
                System.out.println(MessageFormat.format("{0} - Turn on Gasoline motor by comman in hand",this.getBrand()));
            default:
                System.out.println(MessageFormat.format("{0} - Turn on Gasoline motor by key",this.getBrand()));
        }
    }

    @Override
    public void turnOff() {
        switch (this.typeTurnOnOff){
            case "button":
                System.out.println(MessageFormat.format("{0} - Turn off Gasoline motor by button",this.getBrand()));
                break;
            case "command":
                System.out.println(MessageFormat.format("{0} - Turn off Gasoline motor by command",this.getBrand()));
                break;
            case "commandInHand":
                System.out.println(MessageFormat.format("{0} - Turn off Gasoline motor by comman in hand",this.getBrand()));
            default:
                System.out.println(MessageFormat.format("{0} - Turn off Gasoline motor by key",this.getBrand()));
        }
    }
}
