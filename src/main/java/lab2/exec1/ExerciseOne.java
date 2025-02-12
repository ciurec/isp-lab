package src.main.java.lab2.exec1;

import java.util.Random;
import java.util.Scanner;
/**
 * Implement a program according to speciffications bellow:
 * Generate a random number n between 2 and 10;
 * Populate an array of size n with integers read from the keyboard;
 * Compute the arithmetical mean of the array populated in previous step.
 */
public class ExerciseOne {

     public void run() {

        int length = new Random().nextInt(8 - 2) + 2;
        Scanner keyboard = new Scanner(System.in);
        int[] inputArray = new int[length];
        int sum = 0;
        System.out.println("length  is:" + length);
        for (int index = 0; index < length; index++) {
            System.out.println("enter an integer");
            inputArray[index] = keyboard.nextInt();
            sum += inputArray[index];
        }
        System.out.println("Mean is: " + sum / length);
    }
}
