import Interfaces.ICarTurnOnOffAutomatic;
import Models.ElectricCar;
import Models.ElectricMotor;
import Models.GasolineCar;
import Models.GasolineMotor;
import Models.HybridCar;
import Models.Motor;
import Models.Vehicle;

public class App {
    public static void main(String[] args) throws Exception {
        Vehicle v1 = new ElectricCar();

        Motor m1 = new ElectricMotor("Electric", 300, 102);
        Motor m2 = new GasolineMotor("Gasoline", 700, 102);
        
        v1.setMotor(m1);
        v1.setVehicleOn();

        System.out.println("----------------------------");
        
        v1.setMotor(m2);
        v1.setVehicleOn();

        System.out.println("----------------------------");
    }
}
