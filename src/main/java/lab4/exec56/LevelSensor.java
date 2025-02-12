package src.main.java.lab4.exec56;

public class LevelSensor extends Sensor {

    private float value;

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "LevelSensor{" +
                "value=" + value +
                '}';
    }
}
