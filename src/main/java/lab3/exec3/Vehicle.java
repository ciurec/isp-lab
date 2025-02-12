package src.main.java.lab3.exec3;

/**
 * A class called Vehicle contains:
 * <p>
 * Four private instance variables: model (String), type (String), speed (int) and fuelType (char of either 'D' or 'B');
 * One constructor to initialize the attributes;
 * There is no default constructor
 * Public getters/setters for all attribtes; A toString() method that returns “{mode} ({type}) speed {teem} ”, e.g., “Dacia (Logan) speed 150 fuel type B”.
 * Write the Vehicle class.
 * Create two Vehicle object and test getter and setter methods (in main).
 * Compare and test if the two objects created in step before are equals (using public boolean equals(Object o) method).
 * Use a static atribute in Vehicle class to test number of Vehicle objects created. Add static method in Vehicle class which display number of objects created of type Vehile.
 * Write a test class (called VehicleTest) to test toString() method.
 */
public class Vehicle {
    private String model;
    private String type;
    private int speed;
    private FuelType fuelType;
    private static int NUMBER_OF_VEHICLES;
    public static void dispayNumberOfVehicles() {
        System.out.println("Number of vehicles: " + NUMBER_OF_VEHICLES);
    }

    public Vehicle(String model, String type, int speed, FuelType fuelType) {
        this.model = model;
        this.type = type;
        this.speed = speed;
        this.fuelType = fuelType;
        NUMBER_OF_VEHICLES++;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", speed=" + speed +
                ", fuelType=" + fuelType +
                '}';
    }
}
