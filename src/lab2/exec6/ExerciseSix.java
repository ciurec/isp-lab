package src.lab2.exec6;

import java.util.List;
import java.util.Vector;

/**
 * Generate a vector which multiply the precedent 2 values from the vector.
 * First 2 elements of the vector are always 1 and 2. Generate first n elements(n >= 8)
 */
public class ExerciseSix {


    public void run() {

        Integer[] data = {1, 3};

        Vector<Integer> vector = new Vector<>(List.of(data));
        generateVector(vector, 2, 4);
        vector.forEach((element) -> {
            System.out.print(element + " ");
        });
    }

    public Vector<Integer> generateVector(Vector<Integer> data, int idx, int length) {
        if (idx == length) {
            return data;
        } else {
            data.add(data.get(idx-1) * data.get(idx - 2));
            idx += 1;
            return generateVector(data, idx, length);
        }
    }
}
