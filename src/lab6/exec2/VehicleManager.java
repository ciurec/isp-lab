package src.lab6.exec2;


import java.util.*;

/**
 * Create a Java program that simulates a unique vehicle registry system using a Set and a custom class.
 * The system should be able to store a vehicle's VIN (Vehicle Identification Number),
 * license plate, make, model, and year. Since the VIN is a unique identifier for each vehicle,
 * the system should not allow duplicate entries based on the VIN (hint: equals() and hashCode()).
 * It should be able to perform the following operations:
 * <p>
 * Add a vehicle to the registry (if it doesn't already exist).
 * Remove a vehicle from the registry using the VIN.
 * Check if a vehicle with a given VIN is in the registry.
 * Display the list of vehicles in the registry.
 * Add minimal unit tests for the first 3 operations.
 */
public class VehicleManager {

    Set<Vehicle> vehicleSet;

    public VehicleManager(Set<Vehicle> vehicleSet) {
        this.vehicleSet = vehicleSet;
    }

    public void addVehicle(Vehicle vehicle) {

        this.vehicleSet.add(vehicle);

    }

    public Set<Vehicle> getVehicleSet() {
        return vehicleSet;
    }

    public static void main(String[] args) {

        Vehicle vehicleOne = new Vehicle();
        vehicleOne.setVin("WWWAW");

        Vehicle vehicleTwo = new Vehicle();
        vehicleTwo.setVin("WWWAW1");

        Vehicle vehicleThree = new Vehicle();
        vehicleThree.setVin("WWWAW");

        VehicleManager vehicleManager = new VehicleManager(new HashSet<>(List.of(vehicleOne)));
        vehicleManager.addVehicle(vehicleTwo);
        vehicleManager.addVehicle(vehicleThree);
        vehicleManager.getVehicleSet().forEach(vehicle -> {
            System.out.println(vehicle.getVin());
        });
    }
}

class Vehicle {

    private String vin;
    private String licensePlate;
    private String make;
    private String model;
    private Date year;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(vin, vehicle.vin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vin);
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }
}
