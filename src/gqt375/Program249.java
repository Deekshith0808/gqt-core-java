package gqt375;
/**
 * @author sai deekshith
 */
class Person63{
	String name;
	int age;
	void showPersonDetails() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}
class Employee63 extends Person63 {
	int employeeId;
	double salary;
	void showEmployeeDetails() {
		showPersonDetails();
		System.out.println("Employee ID: " + employeeId);
		System.out.println("Salary: ₹" + salary);
	}
}
public class Program249{
	public static void main(String[] args) {
		Person63 person = new Person63();
		person.name = "Rahul";
		person.age = 40;
		System.out.println("=== Person Object ===");
		person.showPersonDetails();
		System.out.println();
		Employee63 emp = new Employee63();
		emp.name = "Anita";
		emp.age = 28;
		emp.employeeId = 101;
		emp.salary = 55000.00;
		System.out.println("=== Employee Object ===");
		emp.showEmployeeDetails();
	}
}
