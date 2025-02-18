package src.main.java.basic.oop.concepts.inheritance.upcasting;

class Employee{
	void doWork(){
		System.out.println("Employee do his job.");
	}
}
 
class Manager extends Employee{
 
	void report(){
		System.out.println("Manager is reporting project status.");
	}
	void doWork(){
		System.out.println("Manager coordinate job.");
	}
 
}

/**
 * Upcasting Upcasting-ul este procesul de conversie a unei referinte la o clasa derivata catre o clasa de baza a acestei clase.
 * Operatie de upcasting este automata si nu trebuie declarata in mod explicit.
 *
 * In exemplul de mai sus am declarat o variabila referinta e, care este initializata cu un obiect de tip Manager.
 * Prin intermeidul referintei e putem accesa obiectul de tip Manager,
 * dar vom putea accesa doar acele metode declarate in cadrul clasei Employee (nu vom avea acces la metoda report() ).
 */
public class TestCasting {
	public static void main(String[] args) {		
		Employee e = new Manager();
		e.doWork();
	}
}
