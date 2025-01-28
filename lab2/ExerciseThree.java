package lab2;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class ExerciseThree {

    /**
     * Write a program which display the geometric mean of
     * the primes number from [a,b] where a,b->[1,200] a<b, a and b are read from keyboard.
     * Giving a vector of first N prime numbers, display the number of prime numbers which have the sum of digits an even number.
     */
    public void run() {
        Scanner sc = new Scanner(System.in);
        int first;
        int second;
        while (true) {
            {
                System.out.println("enter first number");
                first = sc.nextInt(); // Assign the next integer to a variable
                System.out.println("enter second number");
                second = sc.nextInt(); // Assign the next integer to a variable
                if ((first <= 100 && first >= 0) && (second <= 100 && second >= 0) && (first < second)) { // Check if integer meets condition
                    break; // Condition met, break out of loop
                } else {
                    System.out.println("Invalid Input. Please enter a valid number between 0 and 100: ");
                }
            }
        }

        int product = 1;
        for (int index = first; index < second; index++) {

            if (isPrime(index)) {
                product = product * index;
            }
        }
        System.out.println("Geometric mean:" + Math.log(product));

//  Giving a vector of first N prime numbers, display the number of prime numbers which have the sum of digits an even number.

        Integer[] data = {1, 3, 5, 6, 9};

        Vector<Integer> vector = new Vector<>(List.of(data));
        long numberOfPrimeNumbers = vector.stream().filter(element -> (getSumOfDigitis(element) / 2) == 0).count();
        System.out.println("numberOfPrimeNumbers " +numberOfPrimeNumbers);

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

    private int getSumOfDigitis(int number) {
        int sum = 0;
        while (number > 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        return sum;

    }
}
