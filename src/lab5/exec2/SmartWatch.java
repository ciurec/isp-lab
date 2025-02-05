package src.lab5.exec2;

public class SmartWatch implements Chargebale {
    private int batteryLevel;

    @Override
    public int getBatteryLevel() {
        return this.batteryLevel;
    }

    @Override
    public void charge(int durationInMinutes) {

    }
}
