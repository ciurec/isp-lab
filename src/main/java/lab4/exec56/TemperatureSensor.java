package src.main.java.lab4.exec56;

public class TemperatureSensor extends Sensor {

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
