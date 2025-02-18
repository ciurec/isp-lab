package src.main.java.basic.oop.concepts.inheritance.example2;

public class Persoana {
    private String nume;
    private Adresa adr;

    public Persoana(String n, Adresa a){nume=n;adr=a;}
    public void afiseaza(){
        System.out.println("Nume="+nume);
    }
    public static void main(String[] args){
        Adresa a = new Adresa("stradaX",15);
        Persoana p1 = new Persoana("Alin",a);
        Angajat p2 = new Angajat("Jon", new Adresa("Strada mare",142),2000);
        p1.afiseaza();
        p2.afiseaza();
        System.out.println("Impozit persoana "+p2+"="+ p2.calculeazaImpozit());
    }
}

/**
 * Deşi în cadrul clasei derivate nu sunt definite
 * atributele nume şi adr acestea trebuie inţializate întrucât sunt moştenite din cadrul clasei Persoana.
 */
class Angajat extends Persoana{
    private int venit;
    Angajat(String n, Adresa a, int v){
        super(n,a);
        venit = v;
    }
    public void afiseaza(){
        super.afiseaza();
        System.out.println("Venit="+venit);
    }
    public int calculeazaImpozit(){
        return venit/2;
    }
}
class Adresa{
    String strada;
    int nr;
    Adresa(String s, int n){strada = s;nr=n;}
}
