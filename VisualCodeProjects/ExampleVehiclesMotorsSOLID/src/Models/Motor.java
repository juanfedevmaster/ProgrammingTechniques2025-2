package Models;

public abstract class Motor {
    private String type;
    private double power; // en HP o kW
    private double displacement; // en litros o cc
    private boolean isRunning;

    // Constructor vacío
    public Motor() {}

    // Constructor con parámetros
    public Motor(String type, double power, double displacement) {
        this.type = type;
        this.power = power;
        this.displacement = displacement;
        this.isRunning = false;
    }

    // Getters y setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public double getDisplacement() {
        return displacement;
    }

    public void setDisplacement(double displacement) {
        this.displacement = displacement;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }

    public abstract void start();
    public abstract void stop();
}
