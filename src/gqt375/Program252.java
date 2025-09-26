package gqt375;
/**
 * @author sai deekshith
 */
class Motor{
	String make;
	String model;
	int year;
	public Motor(String make,String model,int year){
		this.make=make;
		this.model=model;
		this.year=year;
	}
	public void displayMotorInfo(){
		System.out.println("Make: "+make+", Model: "+model+", Year: "+year);
	}
}
class Truck3 extends Motor{
	double capacity;
	double mileage;
	public Truck3(String make,String model,int year,double capacity,double mileage){
		super(make,model,year);
		this.capacity=capacity;
		this.mileage=mileage;
	}
	public void displayTruckInfo(){
		System.out.println("Truck Details:");
		super.displayMotorInfo();
		System.out.println("Capacity: "+capacity+" tons, Mileage: "+mileage+" km/l");
	}
}
public class Program252{
	public static void main(String[] args){
		Truck3 truck=new Truck3("Volvo","FH16",2022,20.0,8.5);
		truck.displayTruckInfo();
	}
}
