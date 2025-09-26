package gqt375;
/**
 * @author sai deekshith
 */
class Person61 {
	String name;
	int age;
	void displayPersonDetails() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}}
class Employee61 extends Person61 {
	int employeeId;
	double salary;
	void displayEmployeeDetails() {
		displayPersonDetails();
		System.out.println("Employee ID: " + employeeId);
		System.out.println("Salary: ₹" + salary);
	}
}
public class Program245 {
	public static void main(String[] args) {
		Person61 person = new Person61();
		person.name = "Mr. Sharma";
		person.age = 45;
		System.out.println("=== Person Object ===");
		person.displayPersonDetails();
		System.out.println();
		Employee61 emp = new Employee61();
		emp.name = "Anita";
		emp.age = 30;
		emp.employeeId = 1001;
		emp.salary = 75000.00;
		System.out.println("=== Employee Object ===");
		emp.displayEmployeeDetails();
	}
}