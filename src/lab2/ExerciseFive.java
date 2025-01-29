package src.lab2;

import src.lab2.utils.sort.QuickSort;

/**
 Generate a vector of size 20 with random elements from [-1000,1000].
 -display the vector.
 -sort the vector using bubbleSort or quickSort or mergeSort or any sort method
 -display the sorted vector
 */
public class ExerciseFive {
    public void run() {

        int[] data = {1, 3, 5, 6,100, 9, 10, 12, 22};
        QuickSort quickSort = new QuickSort();
        quickSort.sort(data,0,data.length-1);
    }
}
