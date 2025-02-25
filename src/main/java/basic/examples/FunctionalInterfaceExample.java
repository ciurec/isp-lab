package src.main.java.basic.examples;

/**
 * A functional interface in Java is an interface that contains only one abstract method.
 * Functional interfaces can have multiple default or static methods, but only one abstract method.
 * Runnable, ActionListener, and Comparator are common examples of Java functional interfaces.
 * From Java 8 onwards, lambda expressions and method references can be used to represent the instance of a functional interface.
 * <p>
 * Functional Interface is additionally recognized as Single Abstract Method Interfaces.
 * In short, they are also known as SAM interfaces. Functional interfaces in Java are the new feature that provides users with the approach of fundamental programming.
 * <p>
 * The @FunctionalInterface annotation can be used to indicate that an interface is intended to be a functional interface.
 * If an interface has more than one abstract method, it cannot be a functional interface.
 * <p>
 * FunctionalInterface annotation is used to ensure that the functional interface cannot have more than one abstract method.
 * In case more than one abstract methods are present, the compiler flags an “Unexpected @FunctionalInterface annotation” message.
 * However, it is not mandatory to use this annotation.
 */
@FunctionalInterface
interface Printable{

    void print ();
}
class Cat implements Printable {

    @Override
    public void print() {
        System.out.println("Hello from cat");
    }
}

public class FunctionalInterfaceExample {
    public static void main(String[] args) {

        Printable cat = new Cat();
        cat.print ();
    }
    static void print(Printable printable){
        printable.print();
    }
}