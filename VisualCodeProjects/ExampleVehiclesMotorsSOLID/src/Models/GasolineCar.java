package Models;

import Interfaces.ICarTurnOnOffAutomatic;

public class GasolineCar extends Vehicle implements ICarTurnOnOffAutomatic {

    public GasolineCar() {
        super();
    }

    public GasolineCar(String brand, String model, int year, String color, String licensePlate, double weight) {
        super(brand, model, year, color, licensePlate, weight);
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

    @Override
    public void setVehicleOn() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setVehicleOn'");
    }

    @Override
    public void setVehicleOff() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setVehicleOff'");
    }
    
}
