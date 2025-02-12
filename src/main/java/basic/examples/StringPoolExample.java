package src.main.java.basic.examples;

public class StringPoolExample {

    // main function
    public static void main(String[] args) {

        String s1 = "abc";
        String s2  = "abc";

        String s3 = new String("abc");
        String s4 = new String("abc");

        // Note that this == compares whether
        // s1 and s2 refer to same object or not
        if (s1 == s2)
            System.out.println("S1 == S2");
        else
            System.out.println("S1 != S2");

        if (s1.equals(s2))
            System.out.println("S1 equals S2");
        else
            System.out.println("S1 not equals S2");

        if (s3 == s4)
            System.out.println("S3 == S4");
         else
            System.out.println("S3 != S4");

        if (s3.equals(s4))
            System.out.println("S3 equals S4");
        else
            System.out.println("S3 not equals S4");

//        if (s2.equals(s3))
//            System.out.println("S2 equals S3");
//        else
//            System.out.println("S2 not equals S3");

    }
}
