package test;

import org.junit.Test;
import src.lab5.exec2.Laptop;

import static org.junit.Assert.*;

public class LaptopTest {

    @Test
    public void charge() {
        Laptop laptop = new Laptop();
        laptop.charge(10);
    }
}
