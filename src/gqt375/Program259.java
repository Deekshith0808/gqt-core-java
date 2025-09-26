package gqt375;
/**
 * @author sai deekshith
 */
class Person24 {
	String name;
	int age;
	void showPersonDetails() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}
class Student24 extends Person24 {
	int rollNumber;
	String course;
	void showStudentDetails() {
		showPersonDetails();
		System.out.println("Roll Number: " + rollNumber);
		System.out.println("Course: " + course);
	}
}
public class Program259 {
	public static void main(String[] args) {
		Person24 person = new Person24();
		person.name = "Mr. Suresh";
		person.showPersonDetails();
		System.out.println();
		Student24 student = new Student24();
		student.name = "Ravi";
		student.age = 21;
		student.rollNumber = 101;
		student.course = "B.Sc Physics";
		System.out.println("Derived Class Object (Student):");
		student.showStudentDetails();
	} 
}