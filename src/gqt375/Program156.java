package gqt375;
/**
 * @author sai deekshith
 */
public class Program156 {
	String model;
	String color;
	double price;
	public Program156(String model, String color, double price) {
		this.model = model;
		this.color = color;
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public double getPrice() {
		return price;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public static void main(String[] args) {
		Program156 car = new Program156("Sedan", "Blue", 25000.0);
		System.out.println("Color: " + car.getColor());
		car.setColor("Red");
		car.setPrice(26000.0);
		System.out.println("Updated Price: " + car.getPrice());
	}
}

