package src.lab4.exec56;

public class PhSensor extends Sensor {

    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "TemperatureSensor{" +
                "value=" + value +
                '}';
    }
}
