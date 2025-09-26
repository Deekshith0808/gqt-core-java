package gqt375;
/**
 * @author sai deekshith
 */
abstract class Employee13 {
	String name;
	int id;
	Employee13(String name, int id) {
		this.name = name;
		this.id = id;
	}
	abstract void work();
	void showDetails() {
		System.out.println("Name: " + name);
		System.out.println("Employee ID: " + id);
	}
}
class Developer14 extends Employee13 {
	Developer14(String name, int id) {
		super(name, id);
	}
	@Override
	void work() {
		System.out.println("Developer writes and debugs code.");
	}
}
class Manager13 extends Employee13 {
	Manager13(String name, int id) {
		super(name, id);
	}
	@Override
	void work() {
		System.out.println("Manager manages team and resources.");
	}
}
public class Program237 {
	public static void main(String[] args) {
		Employee13 dev = new Developer14("Alice", 101);
		Employee13 mgr = new Manager13("Bob", 102);
		System.out.println("Developer Details:");
		dev.showDetails();
		dev.work();
		System.out.println();
		System.out.println("Manager Details:");
		mgr.showDetails();
		mgr.work();
	}
}
