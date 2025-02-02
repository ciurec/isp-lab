package src.lab4.exec56;

public class Sensor {

    private String manufacturer;
    private String model;
    private String unitOfMeasurement;

    @Override
    public String toString() {
        return "Sensor{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", unitOfMeasurement='" + unitOfMeasurement + '\'' +
                '}';
    }
}
