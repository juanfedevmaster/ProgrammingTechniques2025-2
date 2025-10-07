package Models;

public class ElectricMotor extends Motor{

    public ElectricMotor(){
        super();
    }

    public ElectricMotor(String type, double power, double displacement) {
        super(type,power,displacement);
    }

    @Override
    public void start() {
        System.out.println("Electric motor start");
    }

    @Override
    public void stop() {
        System.out.println("Electric motor start");
    }
    
}
