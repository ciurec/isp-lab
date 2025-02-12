package src.main.java.lab5.exec2;

public class SmartPhone implements Chargebale {
    private int batteryLevel;

    @Override
    public void charge(int durationInMinutes) {

    }
    @Override
    public int getBatteryLevel() {
        return this.batteryLevel;
    }
}
