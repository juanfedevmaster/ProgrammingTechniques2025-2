package Models;

public class GasolineMotor extends Motor{
    public GasolineMotor(){
        super();
    }

    public GasolineMotor(String type, double power, double displacement) {
        super(type,power,displacement);
    }

    @Override
    public void start() {
        System.out.println("Gasoline motor start");
    }

    @Override
    public void stop() {
        System.out.println("Gasoline motor stop");
    }
}
