package gqt375;
/**
 * @author sai deekshith
 */
abstract class Shape {
	abstract double calculateArea();
	abstract double calculatePerimeter();
}
class Circle extends Shape {
	private double radius;
	public Circle(double radius) {
		this.radius = radius;
	}
	@Override
	double calculateArea() {
		return Math.PI * radius * radius;
	}
	@Override
	double calculatePerimeter() {
		return 2 * Math.PI * radius;
	}
}
class Rectangle extends Shape {
	private double length;
	private double width;
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	@Override
	double calculateArea() {
		return length * width;
	}
	@Override
	double calculatePerimeter() {
		return 2 * (length + width);
	}}
public class Program204 {
	public static void main(String[] args) {
		Circle circle = new Circle(5.0);
		System.out.println("Circle Area: " + circle.calculateArea());
		System.out.println("Circle Perimeter: " + circle.calculatePerimeter());
		Rectangle rectangle = new Rectangle(10.0, 2.0);
		System.out.println("Rectangle Area: " + rectangle.calculateArea());
		System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
	}
}