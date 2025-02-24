package src.main.java.basic.oop.concepts.staticexample;

public class Point {

    int x;
    static int y;

    void displayPoint(){
        System.out.println("x="+x);
        System.out.println("y="+y);
        System.out.println("---");
    }

    static void setY(int val){
        y = val;
    }

    public static void main(String[] args) {

        Point p1 = new Point();
        Point p2 = new Point();

        p1.x = 10;
        p1.setY(15);
        p1.displayPoint();

        p2.x = 256;
        Point.y = 342;
        p2.displayPoint();
        p1.displayPoint();

        Point.setY(333);
        p1.displayPoint();
        p2.displayPoint();

    }
}
