package src.main.test;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import src.main.java.lab3.exec3.FuelType;
import src.main.java.lab3.exec3.Vehicle;

public class VehicleTest {

    @Test
    public void testToString() {
        Vehicle vehicle = new Vehicle("test", "Auto",2,FuelType.D);
        Assertions.assertEquals("Vehicle{model='test', type='Auto', speed=2, fuelType=D}",vehicle.toString());
    }
}
