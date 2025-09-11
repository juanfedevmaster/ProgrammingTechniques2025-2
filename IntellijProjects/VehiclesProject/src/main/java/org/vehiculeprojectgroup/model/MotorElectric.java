package org.vehiculeprojectgroup.model;

import java.text.MessageFormat;

public class MotorElectric extends  Motor implements IMotor{
    public MotorElectric(double cylinder, double amountCylinder, String positionCylinders, String brand) {
        super(cylinder, amountCylinder, positionCylinders, brand);
    }

    public MotorElectric(double cylinder) {
        super(cylinder);
    }

    @Override
    public void turnOn() {
        System.out.println(MessageFormat.format("{0} - Turn on Electric motor by console",this.getBrand()));
    }

    @Override
    public void turnOff() {
        System.out.println(MessageFormat.format("{0} - Turn off Electric motor by console",this.getBrand()));
    }
}
