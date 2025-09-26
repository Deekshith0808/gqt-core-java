package gqt375;
/**
 * @author sai deekshith
 */
class Employee24 {
	String name;
	double salary;
	void showEmployeeDetails() {
		System.out.println("Name: " + name);
		System.out.println("Salary: ₹" + salary);
	}
}
class Manager24 extends Employee24 {
	String department;
	void showManagerDetails() {
		showEmployeeDetails();
		System.out.println("Department: " + department);
	}
}
public class Program257 {
	public static void main(String[] args) {
		Employee24 emp = new Employee24();
		emp.name = "Ravi";
		emp.salary = 50000;
		System.out.println("Employee Details:");
		emp.showEmployeeDetails();
		System.out.println();
		Manager24 mgr = new Manager24();
		mgr.name = "Sneha";
		mgr.salary = 75000;
		mgr.department = "HR";
		System.out.println("Manager Details:");
		mgr.showManagerDetails();
	}
}
