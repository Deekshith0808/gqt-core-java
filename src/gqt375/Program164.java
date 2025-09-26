package gqt375;
/**
 * @author sai deekshith
 */
class Program2 {
	private String name;
	private int id;
	private double salary;
	public Program2(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
public class Program164 {
	public static void main(String[] args) {
		Program2 emp = new Program2("Alice", 123, 50000.0);
		System.out.println("Name: " + emp.getName());
		System.out.println("ID: " + emp.getId());
		System.out.println("Salary: " + emp.getSalary());
		emp.setSalary(55000.0);
		System.out.println("New Salary: " + emp.getSalary());
	}
}
