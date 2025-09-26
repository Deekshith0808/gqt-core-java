package gqt375;
/**
 * @author sai deekshith
 */
public class Program155 {
	private String model;
	private String color;
	private double price;
	public Program155(String model, String color, double price) {
		this.model = model;
		this.color = color;
		this.price = price;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void displayInfo() {
		System.out.println("Car Model: " + model);
		System.out.println("Car Color: " + color);
		System.out.println("Car Price: $" + price);
	}
	public static void main(String[] args) {
		Program155 myCar = new Program155("Toyota Camry", "Blue", 30000.0);
		System.out.println("Car Details:");
		myCar.displayInfo();
		myCar.setColor("Red");
		myCar.setPrice(32000.0);
		System.out.println("\nUpdated Car Details:");
		myCar.displayInfo();
	}
}