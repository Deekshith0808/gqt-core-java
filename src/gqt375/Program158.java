package gqt375;
/**
 * @author sai deekshith
 */

class Programs {
	private String title;
	private String author;
	private double price;
	public Programs(String title, String author, double price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
public class Program158 {
	public static void main(String[] args) {
		Programs book = new Programs("The Alchemist", "Paulo Coelho", 15.0);
		System.out.println("Author: " + book.getAuthor());
		book.setPrice(16.0);
		System.out.println("Updated Price: " + book.getPrice());
	}
}