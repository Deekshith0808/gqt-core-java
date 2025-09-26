package gqt375;
/**
 * @author sai deekshith
 */
class Person65 {
	String name;
	int age;
	void showDetails() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}
class Student63 extends Person65 {
	int rollNumber;
	String course;
	void showStudentDetails() {
		showDetails();
		System.out.println("Roll Number: " + rollNumber);
		System.out.println("Course: " + course);
	}
}
public class Program251 {
	public static void main(String[] args) {
		Person65 p = new Person65();
		p.name = "Ravi";
		p.age = 45;
		System.out.println("=== Person Object ===");
		p.showDetails();
		System.out.println();
		Student63 s = new Student63();
		s.name = "Anu";
		s.age = 20;
		s.rollNumber = 101;
		s.course = "B.Sc Computer Science";
		System.out.println("=== Student Object ===");
		s.showStudentDetails();
	}
}
