package src.main.java.basic.examples.defaultvsstatic;

 interface MyInterface {
    default void defaultMethod(){
        System.out.println("Default from my interface");
    }
    void abstractMethod();
    static void staticMethod(){
        System.out.println("Static");
    }    
}

/**
 * O interfata care mosteneste o interfata cu metode default poate pastra comportamentul metodelor default mostenite
 * sau poate suprascrie acest comportament .
 */
interface MyInterface2 extends MyInterface {
    default void defaultMethod(){
        System.out.println("Default from my interface 2");
    }

    static void staticMethod(){
        System.out.println("Static");
    }
}

public class MyClass {

    public static void main(String[] args) {

        MyClass.staticMethod(); //not valid - static method may be invoked on containing interface class only
        MyInterface.staticMethod(); //valid

        MyInterface myInterfaceInstance = new MyInterface(){
            @Override
            public void abstractMethod() {

            }

            @Override
            public void defaultMethod() {
                System.out.println("Overridden default Method");
            }
        };
        myInterfaceInstance.defaultMethod();


        MyInterface myInterfaceInstance2 = new MyInterface2(){

            @Override
            public void abstractMethod() {

            }
        };
        myInterfaceInstance2.defaultMethod();

    }

    static void staticMethod(){
        System.out.println("another static..");
    }
}
