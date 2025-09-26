package gqt375;
/**
 * @author sai deekshith
 */
abstract class Shape3 {
	abstract double area();
	void displayType() {
		System.out.println("I am a two dimensional shape.");
	}
}
class Circle3 extends Shape3 {
	private double radius;
	Circle3(double radius) {
		this.radius = radius;
	}
	@Override
	double area() {
		return Math.PI * radius * radius;
	}
}
class Rectangle3 extends Shape3{
	private double length, width;
	Rectangle3(double length, double width) {
		this.length = length;
		this.width = width;
	}
	@Override
	double area() {
		return length * width;
	}
}
public class Program217 {
	public static void main(String[] args) {
		Shape3 circle = new Circle3(5.0);
		Shape3 rectangle = new Rectangle3(4.0, 3.0);
		circle.displayType();
		System.out.println("Area of circle : " + circle.area());
		rectangle.displayType();
		System.out.println("Area of rectangle : " + rectangle.area());
	}}