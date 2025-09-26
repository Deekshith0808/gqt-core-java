package gqt375;
/**
 * @author sai deekshith
 */
class Person3{
	String name;
	int age;
	public Person3(String name,int age){
		this.name=name;
		this.age=age;
	}
	public void displayPersonInfo(){
		System.out.println("Name: "+name+", Age: "+age);
	}
}
class Student5 extends Person3{
	int rollNumber;
	public Student5(String name,int age,int rollNumber){
		super(name,age);
		this.rollNumber=rollNumber;
	}
	public void displayStudentInfo(){
		displayPersonInfo();
		System.out.println("Roll Number: "+rollNumber);
	}
}
class Teacher extends Person3{
	String subject;
	public Teacher(String name,int age,String subject){
		super(name,age);
		this.subject=subject;
	}
	public void displayTeacherInfo(){
		displayPersonInfo();
		System.out.println("Subject: "+subject);
	}
}
public class Program246{
	public static void main(String[] args){
		Student5 student=new Student5("Alice",20,101);
		Teacher teacher=new Teacher("Mr. John",45,"Mathematics");
		System.out.println("Student Details:");
		student.displayStudentInfo();
		System.out.println("Teacher Details:");
		teacher.displayTeacherInfo();
	}
}