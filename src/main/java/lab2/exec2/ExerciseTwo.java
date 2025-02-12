package src.main.java.lab2.exec2;

import java.util.Scanner;

public class ExerciseTwo {


    /**
     * Implement an application that allows the users to search and find all the words that start
     * with a specific letter in an array.
     * First, the user is asked to input all the words,
     * on one line, separated by comma (e.g. apples,computer,bread,tea,car).
     * Next, the user is asked to input the starting letter.
     * The result(s) are to be printed on a new line.
     * Hint: use the String's split() method to extract the words from the first input line. Then, store them into an array.
     */
    public void run() {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("enter words");
        String words = keyboard.nextLine();
        String[] inputArray = words.split(",");

        for (String s : inputArray) {
            if (s.charAt(0) == 'c') {
                System.out.println(s);
            }
        }
    }
}
