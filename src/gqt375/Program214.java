package gqt375;
/**
 * @author sai deekshith
 */
abstract class Shape2 {
	abstract double calculateArea();
	abstract double calculatePerimeter();
}
class Triangle extends Shape2 {
	private double base;
	private double height;
	private double side1;
	private double side2;
	private double side3;
	public Triangle(double base, double height, double side1, double side2, double side3) {
		this.base = base;
		this.height = height;
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	@Override
	public double calculateArea() {
		return 0.5 * base * height;
	}
	@Override
	public double calculatePerimeter() {
		return side1 + side2 + side3;
	}
}
class Circle2 extends Shape2 {
	private double radius;
	public Circle2(double radius) {
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
public class Program214 {
	public static void main(String[] args) {
		Triangle triangle = new Triangle(5.0, 10.0, 5.0, 5.0, 5.0);
		System.out.println("Triangle Area: " + triangle.calculateArea());
		System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());
		Circle2 circle = new Circle2(7.0);
		System.out.println("Circle Area: " + circle.calculateArea());
		System.out.println("Circle Perimeter: " + circle.calculatePerimeter());
	}
}