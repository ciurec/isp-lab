package src.lab3.exec5;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class VendingMachineTest {

    @Test
    public void displayProduct() {
        VendingMachine vendingMachine = VendingMachine.getInstance();
        vendingMachine.setProducts(List.of(new Product(1, "Prod1")));
        vendingMachine.displayProduct(1);
    }
}
