package gqt375;
/**
 * @author sai deekshith
 */
public class Program157 {
	private String title;
	private String author;
	private double price;
	public Program157(String title, String author, double price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if (price >= 0) {
			this.price = price;
		} else {
			System.out.println("Price cannot be negative.");
		}
	}
	public void displayInfo() {
		System.out.println("Book Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("Price: $" + price);
	}
	public static void main(String[] args) {
		Program157 book = new Program157("Java Programming", "John Doe", 39.99);
		book.displayInfo();
		book.setTitle("Advanced Java");
		book.setPrice(42.99);
		System.out.println("\nUpdated Book Details:");
		book.displayInfo();
	}
}