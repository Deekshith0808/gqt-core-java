package gqt375;
/**
 * @author sai deekshith
 */
class Person21{
	String name;
	int age;
	public Person21(String name,int age){
		this.name=name;
		this.age=age;
	}
	public void displayInfo(){
		System.out.println("Name: "+name+", Age: "+age);
	}
}
class Employee21 extends Person21{
	int id;
	double salary;
	public Employee21(String name,int age,int id,double salary){
		super(name,age);
		this.id=id;
		this.salary=salary;
	}
	@Override
	public void displayInfo(){
		super.displayInfo();
		System.out.println("ID: "+id+", Salary: "+salary);
	}
}
public class Program254{
	public static void main(String[] args){
		Employee21 employee=new Employee21("John Doe",30,101,50000.0);
		employee.displayInfo();
	}
}
