package gqt375;
/**
 * @author sai deekshith
 */
class Gadget{
	String brand;
	double price;
	public Gadget(String brand,double price){
		this.brand=brand;
		this.price=price;
	}
	public void displayGadgetInfo(){
		System.out.println("Brand: "+brand+", Price: $"+price);
	}
}
class Smartphone extends Gadget{
	int storage;
	int batteryCapacity;
	public Smartphone(String brand,double price,int storage,int batteryCapacity){
		super(brand,price);
		this.storage=storage;
		this.batteryCapacity=batteryCapacity;
	}
	public void displaySmartphoneInfo(){
		System.out.println("Smartphone Details:");
		super.displayGadgetInfo();
		System.out.println("Storage: "+storage+"GB, Battery: "+batteryCapacity+"mAh");
	}
}
public class Program250{
	public static void main(String[] args){
		Gadget gadget=new Gadget("Sony",299.99);
		System.out.println("Gadget Details:");
		gadget.displayGadgetInfo();
		System.out.println();
		Smartphone smartphone=new Smartphone("Samsung",999.99,128,5000);
		smartphone.displaySmartphoneInfo();
	}
}
