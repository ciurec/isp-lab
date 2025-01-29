package test;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import src.lab3.exec3.FuelType;
import src.lab3.exec3.Vehicle;

import static org.junit.Assert.*;

public class VehicleTest {

    @Test
    public void testToString() {
        Vehicle vehicle = new Vehicle("test", "Auto",2,FuelType.D);
        Assertions.assertEquals("Vehicle{model='test', type='Auto', speed=2, fuelType=D}",vehicle.toString());
    }
}
