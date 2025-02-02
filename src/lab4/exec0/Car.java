package src.lab4.exec0;

public class Car {

    private Engine engine;
    private CarAlarm carAlarm;
    private String color;

    public Car(Engine engine, String color) {
        this.engine = engine;
        this.color = color;
        this.carAlarm = new CarAlarm();
    }

    public void startCar() {

    }

    public void stopCar() {

    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", carAlarm=" + carAlarm +
                ", color='" + color + '\'' +
                '}';
    }
}

class Engine {
    private boolean status;
    private int power;

    void startEngine() {
    }

    void stopEngine() {
    }

}

class CarAlarm {

    private boolean active;

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "CarAlarm{" +
                "active=" + active +
                '}';
    }
}

class DieselEngine extends Engine {

    private int fuelLevel;

    @Override
    void startEngine() {

    }

    @Override
    void stopEngine() {

    }
}

class ElectricEngine extends Engine {

    private int batteryCapacity;

}
