package Models;

public class HybridCar extends Vehicle {

    public HybridCar() {
        super();
    }

    public HybridCar(String brand, String model, int year, String color, String licensePlate, double weight) {
        super(brand, model, year, color, licensePlate, weight);
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
