package org.vehiculeprojectgroup.model;

import java.text.MessageFormat;

public class MotorHybrid extends Motor implements IMotor{
    public MotorHybrid(double cylinder, double amountCylinder, String positionCylinders, String brand) {
        super(cylinder, amountCylinder, positionCylinders, brand);
    }

    public MotorHybrid(double cylinder) {
        super(cylinder);
    }


    @Override
    public void turnOn() {
        System.out.println(MessageFormat.format("{0} - Turn on Hybrid motor by button",this.getBrand()));
    }

    @Override
    public void turnOff() {
        System.out.println(MessageFormat.format("{0} - Turn off Hybrid motor by button",this.getBrand()));
    }
}
