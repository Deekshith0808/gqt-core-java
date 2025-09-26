package gqt375;
/**
 * @author sai deekshith
 */
class Program171 {
	private String title;
	private String author;
	private double price;
	public Program171(String title, String author, double price) {
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
		this.price = price;
	}
	public void displayInfo() {
		System.out.println("Book Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("Price: $" + price);
	}
	public static void main(String[] args) {
		Program171 book = new Program171("The Alchemist", "Paulo Coelho", 15.0);
		book.displayInfo();
		book.setPrice(16.0);
		System.out.println("\nUpdated Book Details:");
		book.displayInfo();
	}
}