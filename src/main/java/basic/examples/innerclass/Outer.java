package src.main.java.basic.examples.innerclass;

public class Outer {
 
    private String text = "I am Outer private!";
 
    public class Inner {
 
        private String text = "I am Inner private";
 
        public void printText() {
            System.out.println(text);
            System.out.println(Outer.this.text);
        }
    }
}

/**
 * O clasa locala este o clasa interna de instanta (ne statica) care este definita
 * in interiorul unei metode sau a unui bloc {…}. O clasa locala poate fi definita astfel:
 */
class OuterLocal {

    public void printText() {

        class Local {

        }

        Local local = new Local();
    }
}
