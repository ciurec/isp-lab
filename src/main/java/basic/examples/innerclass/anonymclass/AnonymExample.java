package src.main.java.basic.examples.innerclass.anonymclass;// Java program to demonstrate Need for
// Anonymous Inner class

// Interface
interface Age {

    // Defining variables and methods
    int x = 21;
    void getAge();
}

// Class 1
// Helper class implementing methods of Age Interface
class MyClass implements Age {

    // Overriding getAge() method
    @Override public void getAge()
    {
        // Print statement
        System.out.print("Age is " + x);
    }
}

// Class 2
// Main class
// AnonymousDemo
public class AnonymExample {
    // Main driver method
    public static void main(String[] args)
    {
        // Class 1 is implementation class of Age interface
        MyClass obj = new MyClass();

        // calling getage() method implemented at Class1
        // inside main() method
        obj.getAge();

        // A hidden inner class of Age interface is created
        // whose name is not written but an object to it
        // is created.
        Age oj1 = new Age() {

            @Override public void getAge()
            {
                // printing  age
                System.out.print("Age from ano is " + x);
            }
        };

        oj1.getAge();
    }
}
