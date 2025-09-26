package gqt375;
/**
 * @author sai deekshith
 */
abstract class Appliance {
	String brand;
	Appliance(String brand) {
		this.brand = brand;
	}
	abstract void operate();
	void displayBrand() {
		System.out.println("Brand: " + brand);
	}}
class WashingMachine extends Appliance {
	WashingMachine(String brand) {
		super(brand);
	}
	@Override
	void operate() {
		System.out.println("Washing Machine is cleaning clothes...");
	}}
class Refrigerator extends Appliance {
	Refrigerator(String brand) {
		super(brand);
	}
	@Override
	void operate() {
		System.out.println("Refrigerator is cooling food...");
	}
}
public class Program227 {
	public static void main(String[] args) {

		Appliance wm = new WashingMachine("LG");
		Appliance fridge = new Refrigerator("Samsung");
		System.out.println("Washing Machine:");
		wm.displayBrand();
		wm.operate();
		System.out.println("\nRefrigerator:");
		fridge.displayBrand();
		fridge.operate();
	}
}
