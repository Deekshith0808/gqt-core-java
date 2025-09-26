package gqt375;
/**
 * @author sai deekshith
 */
class Student1 {
	private String name;
	private int rollNumber;
	private double marks;
	public Student1(String name, int rollNumber, double marks) {
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
		this.marks = marks;
	}
	public static void main(String[] args) {
		Student1 student = new Student1("Bob", 101, 85.5);
		System.out.println("Name: " + student.getName());
		System.out.println("Roll Number: " + student.getRollNumber());
		System.out.println("Marks: " + student.getMarks());
		student.setMarks(90.0);
		System.out.println("New Marks: " + student.getMarks());
	}
}