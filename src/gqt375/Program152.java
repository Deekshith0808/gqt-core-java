package gqt375;
/**
 * @author sai deekshith
 */
class Student {
	private String name;
	private int rollNumber;
	private int age;
	public Student(String name, int rollNumber, int age) {
		this.name = name;
		this.rollNumber = rollNumber;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
public class Program152 {
	public static void main(String[] args) {
		Student student = new Student("Alice", 101, 20);
		System.out.println("Name: " + student.getName());
		System.out.println("Age: " + student.getAge());
		student.setAge(21);
		System.out.println("Updated Age: " + student.getAge());
	}
}