package gqt375;
/**
 * @author sai deekshith
 */
class Shape29 {
	String type;
	String color;
	void showShapeDetails() {
		System.out.println("Shape Type: " + type);
		System.out.println("Color: " + color);
	}
}
class Circle29 extends Shape29 {
	double radius;
	double area;
	void calculateArea() {
		area = Math.PI * radius * radius;
	}
	void showCircleDetails() {
		showShapeDetails();
		System.out.println("Radius: " + radius);
		System.out.println("Area: " + area);
	}
}
public class Program266{
	public static void main(String[] args) {
		Circle29 c = new Circle29();
		c.type = "Circle";
		c.color = "Red";
		c.radius = 7.0;
		c.calculateArea();
		System.out.println("Circle Information:");
		c.showCircleDetails();
	}
}
