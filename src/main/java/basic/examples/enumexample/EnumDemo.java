package src.main.java.basic.examples.enumexample;

import static src.main.java.basic.examples.enumexample.Mobile.Samsung;

enum Mobile {
   Samsung(400), Nokia(250),Motorola(325);
 
   int price;
   Mobile(int p) {
      price = p;
   }
   int showPrice() {
      return price;
   }
}

/**
 * An enum can, just like a class , have attributes and methods.
 * The only difference is that enum constants are public , static and final (unchangeable - cannot be overridden).
 * An enum cannot be used to create objects, and it cannot extend other classes (but it can implement interfaces).
 */
public class EnumDemo {
   
   public static void main(String args[]) {  
     System.out.println("CellPhone List:");
     Mobile ret;
     ret = Mobile.valueOf("Nokia");
     System.out.println("Selected : " + ret);
     System.out.println(Samsung.showPrice());
   }
}
