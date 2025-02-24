package src.main.java.basic.examples.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListVsLinkedList {
    public static void main(String[] args) {
        LinkedList<String> namesLinkedList = new LinkedList<>();
        namesLinkedList.add("John");
        namesLinkedList.add("Paul");
        namesLinkedList.add("George");
        namesLinkedList.add("Ringo");
        namesLinkedList.add(2,"New name");
        namesLinkedList.get(1);

        ArrayList<String> namesArrayList = new ArrayList<>();
        namesArrayList.add("John");
        namesArrayList.add("Paul");
        namesArrayList.add("George");
        namesArrayList.add("Ringo");
        namesArrayList.get(1);
        namesLinkedList.add(2,"New name");

    }
}
