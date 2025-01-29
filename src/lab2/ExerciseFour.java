package src.lab2;

import java.util.List;
import java.util.Vector;
/**
 * Given an vector of N integer elements.
 * Display the first prime/odd/even number from the vector and their respective position
 */
public class ExerciseFour {

    public void run() {

        Integer[] data = {1, 3, 5, 6, 9, 10, 12, 22};

        Vector<Integer> vector = new Vector<>(List.of(data));

        NumberModel primeNumberModel = new NumberModel();
        NumberModel oddNumberModel = new NumberModel();
        NumberModel evenNumberModel = new NumberModel();
        for (Integer element : vector) {
            if (!primeNumberModel.isFound() && isPrime(element)) {
                primeNumberModel.setFound(true);
                primeNumberModel.setPosition(vector.indexOf(element));
                primeNumberModel.setValue(element);
            }
            if (!oddNumberModel.isFound() && element / 2 != 0) {
                oddNumberModel.setFound(true);
                oddNumberModel.setPosition(vector.indexOf(element));
                oddNumberModel.setValue(element);
            }
            if (!evenNumberModel.isFound() && element / 2 == 0) {
                evenNumberModel.setFound(true);
                evenNumberModel.setPosition(vector.indexOf(element));
                evenNumberModel.setValue(element);
            }
        }
        System.out.println("First prime position: " + primeNumberModel.getPosition());
        System.out.println("First prime: " + primeNumberModel.getValue());

    }

    private boolean isPrime(int number) {
        int root = (int) Math.sqrt(number);
        for (int i = 2; i <= root; i++) {
            if ((number % i) == 0) {
                return false;
            }
        }
        return true;

    }
}

class NumberModel {
    private int value;
    private int position;
    private boolean found;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public boolean isFound() {
        return found;
    }

    public void setFound(boolean found) {
        this.found = found;
    }
}
