package src.main.java.basic.examples.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayVsArrayList {

    public static void main(String... args) {
        String array[] = new String[4];
        String array2[] = {"Cat", "Dog", "Horse", "Fish"};

        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("Cat", "Dog", "Horse", "Fish"));
        List<String> arrayListImmutable = Arrays.asList("Cat", "Dog", "Horse", "Fish");
        arrayList.add("Tiger");
//        arrayListImmutable.add("Tiger");
        System.out.println("From arraylist " + arrayList);
        System.out.println("From array " + array);
        System.out.println(arrayList.remove(1 ));
    }
}
