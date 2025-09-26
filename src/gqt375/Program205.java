package gqt375;
/**
 * @author sai deekshith
 */
abstract class GeometricShape {
	abstract double calculateArea();
	abstract double calculatePerimeter();
}
class Circle1 extends GeometricShape {
	private double radius;
	public Circle1(double radius) {
		this.radius = radius;
	}
	@Override
	public double calculateArea() {
		return Math.PI * radius * radius;
	}
	@Override
	public double calculatePerimeter() {
		return 2 * Math.PI * radius;
	}
}
class Rectangle1 extends GeometricShape {
	private double length;
	private double width;
	public Rectangle1(double length, double width) {
		this.length = length;
		this.width = width;
	}
	@Override
	public double calculateArea() {
		return length * width;
	}
	@Override
	public double calculatePerimeter() {
		return 2 * (length + width);
	}
}
public class Program205 {
	public static void main(String[] args) {
		Circle circle = new Circle(5.0);
		System.out.println("Circle Area: " + circle.calculateArea());
		System.out.println("Circle Perimeter: " + circle.calculatePerimeter());
		Rectangle rectangle = new Rectangle(6.0, 4.0);
		System.out.println("Rectangle Area: " + rectangle.calculateArea());
		System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
	}
}
