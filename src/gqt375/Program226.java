package gqt375;
/**
 * @author sai deekshith
 */
abstract class Shape7 {
	abstract double calculateArea();
	abstract double calculatePerimeter();
}
class Rectangle5 extends Shape7 {
	private double length;
	private double width;
	public Rectangle5(double length, double width) {
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
class Square extends Shape7 {
	private double side;
	public Square(double side) {
		this.side = side;
	}
	@Override
	public double calculateArea() {
		return side * side;
	}
	@Override
	public double calculatePerimeter() {
		return 4 * side;
	}
}
public class Program226 {
	public static void main(String[] args) {
		Shape7 rectangle = new Rectangle5(5, 10);
		Shape7 square = new Square(7);
		System.out.println("Rectangle Area: " + rectangle.calculateArea());
		System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
		System.out.println("Square Area: " + square.calculateArea());
		System.out.println("Square Perimeter: " + square.calculatePerimeter());
	}
}
