package src.main.java.lab4.exec56;

public class AquariumController {
    private FishFeeder fishFeeder;
    private String manufacturer;
    private String model;
    private float currentTime;
    private float feedingTime;
    private int presentTemperature;
    private int presentLevel;

    private LevelSensor lvlSensor;
    private TemperatureSensor tmpSensor;
    private PhSensor phSensor;
    private Actuator alarm;
    private Actuator heater;

    public void setCurrentTime(float currentTime) {
        this.currentTime = currentTime;
    }

    public void setFeedingTime(float feedingTime) {
        this.feedingTime = feedingTime;
    }

    public void checkTemperature() {

    }

    public void checkWaterLevel() {

    }

    @Override
    public String toString() {
        return "AquariumController{" +
                "fishFeeder=" + fishFeeder +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", currentTime=" + currentTime +
                ", feedingTime=" + feedingTime +
                ", presentTemperature=" + presentTemperature +
                ", presentLevel=" + presentLevel +
                ", lvlSensor=" + lvlSensor +
                ", tmpSensor=" + tmpSensor +
                ", alarm=" + alarm +
                ", heater=" + heater +
                '}';
    }

    public void setPresentTemperature(int presentTemperature) {
        this.presentTemperature = presentTemperature;
    }

    public void setLvlSensor(LevelSensor lvlSensor) {
        this.lvlSensor = lvlSensor;
    }

    public void setTmpSensor(TemperatureSensor tmpSensor) {
        this.tmpSensor = tmpSensor;
    }

    public void setPhSensor(PhSensor phSensor) {
        this.phSensor = phSensor;
    }
}
