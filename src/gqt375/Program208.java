package gqt375;
/**
 * @author sai deekshith
 */
abstract class Employee {
	abstract double calculateSalary();
	abstract double calculateBonus();
}
class Manager extends Employee {
	private double salary;
	public Manager(double salary) {
		this.salary = salary;
	}
	@Override
	public double calculateSalary() {
		return salary;
	}
	@Override
	public double calculateBonus() {
		return salary * 0.2;
	}
}
class Clerk extends Employee {
	private double salary;
	public Clerk(double salary) {
		this.salary = salary;
	}
	@Override
	public double calculateSalary() {
		return salary;
	}
	@Override
	public double calculateBonus() {
		return salary * 0.1;
	}
}
public class Program208 {
	public static void main(String[] args) {
		Manager manager = new Manager(5000.0);
		System.out.println("Manager Salary: " + manager.calculateSalary());
		System.out.println("Manager Bonus: " + manager.calculateBonus());
		Clerk clerk = new Clerk(3000.0);
		System.out.println("Clerk Salary: " + clerk.calculateSalary());
		System.out.println("Clerk Bonus: " + clerk.calculateBonus());
	}
}
