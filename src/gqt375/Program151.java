package gqt375;
/**
 * @author sai deekshith
 */
class Program151 {
	String name;
	int rollNumber;
	int age;
	public Program151(String name, int rollNumber, int age) {
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
	public void setName(String name) {
		this.name = name;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public static void main(String[] args) {
		Program151 student1 = new Program151("Alice", 101, 20);
		System.out.println("Student Name: " + student1.getName());
		System.out.println("Student Roll Number: " + student1.getRollNumber());
		System.out.println("Student Age: " + student1.getAge());
		student1.setName("Bob");
		student1.setAge(21);
		System.out.println("Updated Student Name: " + student1.getName());
		System.out.println("Updated Student Age: " + student1.getAge());
	}
}
