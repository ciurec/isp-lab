package src.main.java.basic.oop.concepts.inheritance.downcasting;
class Employee{
	void doWork(){
		System.out.println("Employee do his job.");
	}
}

class Manager extends Employee {

	void report(){
		System.out.println("Manager is reporting project status.");
	}
	void doWork(){
		System.out.println("Manager coordinate job.");
	}

}

/**
 * Upcasting is allowed in Java, however downcasting gives a compile error.
 * The compile error can be removed by adding a cast but would anyway break at the runtime.
 */
public class TestCasting {
 
public static void main(String[] args) {		
		Employee alin = new Manager();
		alin.doWork(); 
 
		((Manager)alin).report(); //1.
 
		Employee dan = new Employee(); //2.
 
		((Manager)dan).report(); //3.
 
	}
}
