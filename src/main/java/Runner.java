package src.main.java;

import src.main.java.lab3.exec1.Tree;
import src.main.java.lab5.exec2.Laptop;
import java.lang.String;

public class Runner {
    public static void main(String[] args) {
        //  Lab 2
//        ExerciseOne exerciseOne = new ExerciseOne();
//        exerciseOne.run();
//
//
//        ExerciseTwo exerciseTwo = new ExerciseTwo();
//
//        exerciseTwo.run();
//
//        ExerciseThree exerciseThree = new ExerciseThree();
//        exerciseThree.run();
//        ExerciseFour exerciseFour = new ExerciseFour();
//        exerciseFour.run();
//
//        ExerciseFive exerciseFive = new ExerciseFive();
//        exerciseFive.run();
//
//        ExerciseSix exerciseSix = new ExerciseSix();
//        exerciseSix.run();

        // Lab 3
//        Tree tree = new Tree();
//        tree.grow(10);
//
//
//        // Lab 5
//        Laptop laptop = new Laptop();
//        laptop.charge(10);
//        for (int i = 1, j = 2; i < 10; i++, j++) {
//
//            System.out.println(i + " "+ j);
//        }

        int count = 12;
        do {
            System.out.println("From do-while :Count is: " + count);
            count++;
        } while (count < 11);

        count = 12;
        while (count < 11) {
            System.out.println("From While Count is: " + count);
            count++;
        }

        String[][] names = {
                {"Mr. ", "Mrs. ", "Ms. "},
                {"Smith", "Jones"}
        };
    }


}
