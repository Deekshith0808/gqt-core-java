package gqt375;
/**
 * @author sai deekshith
 */
public class Program159 {
	private String name;
	private int rollNumber;
	private double marks;
	public Program159(String name, int rollNumber, double marks) {
		this.name = name;
		this.rollNumber = rollNumber;
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		if (marks >= 0) {
			this.marks = marks;
		} else {
			System.out.println("Marks cannot be negative.");
		}
	}
	public void displayStudentDetails() {
		System.out.println("Student Name: " + name);
		System.out.println("Roll Number: " + rollNumber);
		System.out.println("Marks: " + marks);
	}
	public static void main(String[] args) {
		Program159 student = new Program159("Alice", 101, 85.5);
		student.displayStudentDetails();
		student.setName("Bob");
		student.setMarks(90.0);
		System.out.println("\nUpdated Student Details:");
		student.displayStudentDetails();
	} 
}