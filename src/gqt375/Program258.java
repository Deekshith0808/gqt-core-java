package gqt375;
/**
 * @author sai deekshith
 */
class Person23 {
	String name;
	int age;
	void showPersonDetails() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}
class Employee23 extends Person23 {
	int id;
	double salary;
	void showEmployeeDetails() {
		showPersonDetails();
		System.out.println("Employee ID: " + id);
		System.out.println("Salary: ₹" + salary);
	}
}
public class Program258 {
	public static void main(String[] args) {
		Employee23 emp = new Employee23();
		emp.name = "Anjali";
		emp.age = 28;
		emp.id = 1001;
		emp.salary = 60000.00;
		System.out.println("Employee Information:");
		emp.showEmployeeDetails();
	}
}