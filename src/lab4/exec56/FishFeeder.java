package src.lab4.exec56;

public class FishFeeder {
    private String manufacturer;
    private String model;
    private int meals;

    public void feed(){}
    public void fillUp(){}

    @Override
    public String toString() {
        return "FishFeeder{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", meals=" + meals +
                '}';
    }
}
