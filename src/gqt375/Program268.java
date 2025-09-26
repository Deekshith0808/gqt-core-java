package gqt375;
/**
 * @author sai deekshith
 */
class Employee32{
	String name;
	int id;
	double salary;
	public Employee32(String name,int id,double salary){
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	public void displayEmployeeInfo(){
		System.out.println("Name: "+name+", ID: "+id+", Salary: $"+salary);
	}
}
class Manager32 extends Employee32{
	String department;
	String designation;
	public Manager32(String name,int id,double salary,String department,String designation){
		super(name,id,salary);
		this.department=department;
		this.designation=designation;
	}
	public void displayManagerInfo(){
		super.displayEmployeeInfo();
		System.out.println("Department: "+department+", Designation: "+designation);
	}}
public class Program268{
	public static void main(String[] args){
		Manager32 manager=new Manager32("Alice Johnson",101,75000.0,"IT","Project Manager");
		System.out.println("Manager Details:");
		manager.displayManagerInfo();
	}
}