package src.main.test;

import org.junit.Test;
import src.main.java.lab5.exec2.Laptop;

public class LaptopTest {

    @Test
    public void charge() {
        Laptop laptop = new Laptop();
        laptop.charge(10);
    }
}
