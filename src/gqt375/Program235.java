package gqt375;
/**
 * @author sai deekshith
 */
abstract class Shape12 {
	abstract double calculateArea();
	void display() {
		System.out.println("This is a shape.");
	}
}
class Circle12 extends Shape12 {
	double radius;
	Circle12(double radius) {
		this.radius = radius;
	}
	@Override
	double calculateArea() {
		return Math.PI * radius * radius;
	}
}
class Rectangle12 extends Shape12 {
	double length, width;
	Rectangle12(double length, double width) {
		this.length = length;
		this.width = width;
	}
	@Override
	double calculateArea() {
		return length * width;
	}
}
public class Program235 {
	public static void main(String[] args) {
		Shape12 circle = new Circle12(5.0);
		Shape12 rectangle = new Rectangle12(4.0, 3.0);
		System.out.println("Circle:");
		circle.display();
		System.out.println("Area: " + circle.calculateArea());
		System.out.println("\nRectangle:");
		rectangle.display();
		System.out.println("Area: " + rectangle.calculateArea());
	}
}