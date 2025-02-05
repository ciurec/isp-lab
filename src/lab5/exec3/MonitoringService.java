package src.lab5.exec3;

import java.util.List;

public class MonitoringService {
    private List<Sensor> sensors;

    public List<Sensor> getSensors() {
        return sensors;
    }

    public void setSensors(List<Sensor> sensors) {
        this.sensors = sensors;
    }

    public double getAverageTemperatureSensors() {

        return sensors.stream()
                .filter(sens -> sens instanceof TemperatureSensor)
                .mapToDouble(tempSens -> ((TemperatureSensor) tempSens).getTemperature()).average().orElse(0d);

    }

    public double getAverageAllSensors() {
        return sensors.stream()
                .mapToDouble(tempSens -> ((TemperatureSensor) tempSens).getTemperature()).average().orElse(0d);

    }
}
