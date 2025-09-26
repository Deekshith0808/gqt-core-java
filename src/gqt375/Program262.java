package gqt375;
/**
 * @author sai deekshith
 */
class Vehicle25{
	String make;
	String model;
	int year;
	public Vehicle25(String make,String model,int year){
		this.make=make;
		this.model=model;
		this.year=year;
	}
	public void displayInfo(){
		System.out.println("Make: "+make);
		System.out.println("Model: "+model);
		System.out.println("Year: "+year);
	}
}
class Car25 extends Vehicle25{
	String color;
	double mileage;
	public Car25(String make,String model,int year,String color,double mileage){
		super(make,model,year);
		this.color=color;
		this.mileage=mileage;
	}
	@Override
	public void displayInfo(){
		super.displayInfo();
		System.out.println("Color: "+color);
		System.out.println("Mileage: "+mileage+" km/l");
	}
}
public class Program262{
	public static void main(String[] args){
		Car25 myCar=new Car25("Toyota","Camry",2022,"Red",15.5);
		myCar.displayInfo();
	}
}
