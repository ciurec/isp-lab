package src.main.java.lab3.exec56;

import org.junit.Test;

import java.util.List;

public class VendingMachineTest {

    @Test
    public void displayProduct() {
        VendingMachine vendingMachine = VendingMachine.getInstance();
        vendingMachine.setProducts(List.of(new Product(1, "Prod1")));
        vendingMachine.displayProduct(1);
    }
}
