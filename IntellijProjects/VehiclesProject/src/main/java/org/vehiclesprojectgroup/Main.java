package org.vehiclesprojectgroup;

import org.vehiculeprojectgroup.model.*;

public class Main {
    public static void main(String[] args) {
        IMotor motor = new MotorGasoline(2.5,4,"inline","Yamaha","command");
        var vehicule = new Vehicule(motor,"Renault",3,"Twingo",2007);

        vehicule.getMotor().turnOn();
        vehicule.getMotor().turnOff();

        System.out.println("++++++++++++++++++++++++++++++");

        IMotor electricMotor = new MotorElectric(0,0,"NA","BYD");
        vehicule.setMotor(electricMotor);

        vehicule.getMotor().turnOn();
        vehicule.getMotor().turnOff();

        System.out.println("++++++++++++++++++++++++++++++");

        IMotor hybridMotor = new MotorHybrid(2.5,4,"inline","Honda");
        vehicule.setMotor(hybridMotor);

        vehicule.getMotor().turnOn();
        vehicule.getMotor().turnOff();

    }
}