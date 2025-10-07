package Models;

public class HybridMotor extends Motor{

    public HybridMotor() {
        super();
    }

    public HybridMotor(String type, double power, double displacement) {
        super(type,power,displacement);
    }
    @Override
    public void start() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'start'");
    }

    @Override
    public void stop() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'stop'");
    }
    
}
