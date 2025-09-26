package gqt375;
/**
 * @author sai deekshith
 */
abstract class Employee3 {
	String name;
	int employeeId;
	Employee3(String name, int employeeId) {
		this.name = name;
		this.employeeId = employeeId;
	}
	abstract double calculateSalary();
	void displayDetails() {
		System.out.println("Name: " + name);
		System.out.println("Employee ID: " + employeeId);
	}
}
class FullTimeEmployee extends Employee3 {
	double monthlySalary;
	FullTimeEmployee(String name, int id, double monthlySalary) {
		super(name, id);
		this.monthlySalary = monthlySalary;
	}
	@Override
	double calculateSalary() {
		return monthlySalary;
	}
}