package Models;

import Interfaces.ICarTurnOnOffAutomatic;

public class ElectricCar extends Vehicle implements ICarTurnOnOffAutomatic{
    public ElectricCar() {
        super();
    }

    public ElectricCar(String brand, String model, int year, String color, String licensePlate, double weight) {
        super(brand, model, year, color, licensePlate, weight);
    }

    @Override
    public void setVehicleOn() {
        this.getMotor().start();
    }

    @Override
    public void setVehicleOff() {
        this.getMotor().stop();
    }

    public void openCar(boolean key){
        if(!key)
            System.out.println("Vehicle close doors");
        else
            System.out.println("Vehicle open doors");
    }

    @Override
    public void automaticTurnOn(int[] commands) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'automaticTurnOn'");
    }

    @Override
    public void automaticTurnOff(int[] commands) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'automaticTurnOff'");
    }
}
