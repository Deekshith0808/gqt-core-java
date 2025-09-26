package gqt375;
/**
 * @author sai deekshith
 */
class StudentMarks {
	private String name;
	private int rollNumber;
	private double marks;
	public StudentMarks(String name, int rollNumber, double marks) {
		this.name = name;
		this.rollNumber = rollNumber;
		this.marks = marks;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
}
public class Program160 {
	public static void main(String[] args) {
		StudentMarks student = new StudentMarks("Bob", 102, 85.0);
		System.out.println("Marks: " + student.getMarks());
		student.setMarks(88.0);
		System.out.println("Updated Marks: " + student.getMarks());
	}
}