package gqt375;
/**
 * @author sai deekshith
 */
class Person2 {
	String name;
	int age;
	void displayInfo() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}
class Student2 extends Person2 {
	String course;
	void showStudentDetails() {
		displayInfo();
		System.out.println("Course: " + course);
	}
}
public class Program239 {
	public static void main(String[] args) {
		Person2 person = new Person2();
		person.name = "John";
		person.age = 40;
		System.out.println("Person Details:");
		person.displayInfo();
		System.out.println();
		Student2 student = new Student2();
		student.name = "Alice";
		student.age = 20;
	}
}
