package src.main.java.lab3.exec2;

/**
 * A class called Rectangle contains:
 * <p>
 * Three private instance variables: length (of type int), width(of type int) and color (of type String), with default value of 2, 1 and “red”, respectively.
 * One overloaded constructor which sets the length and the width;
 * One overloaded constructor which sets the length, the width and the colors;
 * Five public methods: getLength(), getWidth(), getColor(), getPerimeter() and getArea().
 * Write a class which models the class Rectangle.
 * Create a rectangle object, call all his methods and print out the values(in main)
 */
public class Rectangle {
    private int length;
    private int width;
    private String color;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(int length, int width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public String getColor() {
        return color;
    }

    public int getParameter() {
        return (length + width) * 2;
    }

    public int getArea() {
        return length * width;
    }
}
