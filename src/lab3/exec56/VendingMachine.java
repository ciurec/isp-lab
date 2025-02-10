package src.lab3.exec56;

import java.util.List;

/**
 * A class VendingMachine contains:
 * <p>
 * A method displayProducts() - display available products and corresponding selection id;
 * A method insertCoin(int value) - add coins to current vending machine credit;
 * A method String selectProduct(int id) - return a String representing name of the selected product or an error message;
 * A method displayCredit - display current available credit;
 * A method userMenu() - provide a text based menu for interacting with vending machine.
 * Write the code for VendingMachine. Consider adding any additional methods and attributes (if required) to implement the vending machine behaviour.
 * Write a test class (called VendingMachineTest) to test methods: displayProducts, insertCoin, selectProduct.
 * Create a vending machine object and test it in main.
 */
public class VendingMachine {

    private static VendingMachine machine = null;


    private VendingMachine() {
    }

    public static synchronized VendingMachine getInstance() {
        if (machine == null)
            machine = new VendingMachine();

        return machine;
    }

    private List<Product> products;
    private int coins;

    public void displayProduct(int id) {

        Product searchedProduct = this.products.stream().filter(product -> product.getId() == id).findFirst().orElse(null);

        System.out.println(searchedProduct != null ? searchedProduct.getName() : "Product not found");

    }

    private void insertCoin(int value) {
        coins += value;
    }

    private void userMenu() {

//        dispplay options

    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
