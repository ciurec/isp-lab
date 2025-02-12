package src.lab6.exec3;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class OnlineStore {

    private List<Product> products;

    private Map<String, ActiveSession> session;


    void addSession(String username) {
    }

    void removeSession(String username) {
    }

    public void addToChart(String username, Product product, Integer quantity) {

    }

    public void checkout(String username) {

    }

    public List<Product> getProducts() {
        return products;
    }

    public List<Product> getProductsSorted(Comparator<Product> sortCriteria) {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Map<String, ActiveSession> getSession() {
        return session;
    }

    public void setSession(Map<String, ActiveSession> session) {
        this.session = session;
    }
}
