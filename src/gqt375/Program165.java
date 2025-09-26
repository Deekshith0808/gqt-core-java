package gqt375;
/**
 * @author sai deekshith
 */

class Program165 {
	private String brand;
	private String model;
	private double price;
	public Program165(String brand, String model, double price) {
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if (price > 0) {
			this.price = price;
		} else {
			System.out.println("Price must be greater than zero.");
		}
	}
	public void displayInfo() {
		System.out.println("Brand: " + brand);
		System.out.println("Model: " + model);
		System.out.println("Price: $" + price);
	}
	public static void main(String[] args) {
		Program165 phone = new Program165("Samsung", "Galaxy S21", 799.99);
		phone.displayInfo();
		phone.setPrice(850.00);
		System.out.println("Updated Price: $" + phone.getPrice());
		phone.setPrice(-100);
	} 
}