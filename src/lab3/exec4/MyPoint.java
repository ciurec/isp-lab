package src.lab3.exec4;

/**
 * A class called MyPoint, which models a 3D point with x, y and z coordinates contains:
 * <p>
 * Three instance variables x (int), y (int) and z(int).
 * A “no-argument” (or “no-arg”) constructor that construct a point at (0, 0, 0).
 * A constructor that constructs a point with the given x, y and z coordinates.
 * Getter and setter for the instance variables x, y and z.
 * A method setXYZ(int x, int y, int z) to set all x, y and z.
 * A toString() method that returns a string description of the instance in the format “(x, y, z)”.
 * A method called distance(int x, int y, int z) that returns the distance from this point to another point at the given (x, y, z) coordinates.
 * An overloaded distance(MyPoint another) that returns the distance from this point to the given MyPoint instance another.
 * Write the code for the class MyPoint.
 * Write a test class (called MyPointTest) to test distance(...) method.
 * Create two point objects, calculate and display distance between them (in main).
 */
public class MyPoint {
    private int x;
    private int y;
    private int z;

    public MyPoint() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public MyPoint(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void setXYZ(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getDistance(int x, int y, int z) {

        return Math.sqrt(Math.pow(x - this.x, 2)) + Math.log(Math.pow(y - this.y, 2) + Math.log(Math.pow(z - this.z, 2)));
    }

    public double getDistance(MyPoint anotherPoint) {

        return Math.sqrt(Math.pow(anotherPoint.x - this.x, 2)) + Math.log(Math.pow(anotherPoint.y - this.y, 2) + Math.log(Math.pow(anotherPoint.z - this.z, 2)));
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "MyPoint{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
