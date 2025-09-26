package gqt375;
/**
 * @author sai deekshith
 */
class Employee6{
	String name;
	int id;
	double salary;
	public Employee6(String name,int id,double salary){
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	public void displayEmployeeInfo(){
		System.out.println("Name: "+name+", ID: "+id+", Salary: $"+salary);
	}
}
class Manager9 extends Employee6{
	String department;
	String designation;
	public Manager9(String name,int id,double salary,String department,String designation){
		super(name,id,salary);
		this.department=department;
		this.designation=designation;
	}
	public void displayManagerInfo(){
		super.displayEmployeeInfo();
		System.out.println("Department: "+department+", Designation: "+designation);
	}
}
public class Program244{
	public static void main(String[] args){
		Manager9 manager=new Manager9("Alice Johnson",101,75000.0,"IT","Project Manager");
		System.out.println("Manager Details:");
		manager.displayManagerInfo();
	}
}