package gqt375;
/**
 * @author sai deekshith
 */
abstract class Shape41 {
	abstract void calculateArea();
	abstract void calculatePerimeter();
}
class Triangle41 extends Shape41 {
	double a, b, c;
	double s, area;
	Triangle41(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	void calculateArea() {
		s = (a + b + c) / 2;
		area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
		System.out.println("Triangle Area: " + area);
	}
	void calculatePerimeter() {
		double perimeter = a + b + c;
		System.out.println("Triangle Perimeter: " + perimeter);
	}}
class Circle41 extends Shape41 {
	double radius;
	Circle41(double radius) {
		this.radius = radius;
	}
	void calculateArea() {
		double area = Math.PI * radius * radius;
		System.out.println("Circle Area: " + area);
	}
	void calculatePerimeter() {
		double perimeter = 2 * Math.PI * radius;
		System.out.println("Circle Perimeter: " + perimeter);
	}}
public class Program232 {
	public static void main(String[] args) {
		Shape41 shape;
		shape = new Triangle41(3, 4, 5);
		System.out.println("-- Triangle --");
		shape.calculateArea();
		shape.calculatePerimeter();
		System.out.println();
		shape = new Circle41(7);
		System.out.println("-- Circle --");
		shape.calculateArea();
		shape.calculatePerimeter();
	}
}
