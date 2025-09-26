package gqt375;
/**
 * @author sai deekshith
 */
class Employee15 {
	String name;
	double salary;
	void displayDetails() {
		System.out.println("Name: " + name);
		System.out.println("Salary: ₹" + salary);
	}
}
class Developer extends Employee15 {
	String programmingLanguage;
	void showDeveloperInfo() {
		displayDetails();
		System.out.println("Programming Language: " + programmingLanguage);
	}
}
class Tester extends Employee15 {
	String testingTool;
	void showTesterInfo() {
		displayDetails();
		System.out.println("Testing Tool: " + testingTool);
	}
}
public class Program243 {
	public static void main(String[] args) {
		Developer dev = new Developer();
		dev.name = "Alice";
		dev.salary = 80000;
		dev.programmingLanguage = "Java";
		System.out.println("Developer Info:");
		dev.showDeveloperInfo();
		System.out.println();
		Tester tester = new Tester();
		tester.name = "Bob";
		tester.salary = 70000;
		tester.testingTool = "Selenium";
		System.out.println("Tester Info:");
		tester.showTesterInfo();
	}
}