package gqt375;
/**
 * @author sai deekshith
 */
class Shape26 {
	String type;
	String color;
	void showShapeDetails() {
		System.out.println("Shape Type: " + type);
		System.out.println("Color: " + color);
	}
}
class Rectangle26 extends Shape26 {
	double length;
	double width;
	void showRectangleDetails() {
		showShapeDetails();
		System.out.println("Length: " + length);
		System.out.println("Width: " + width);
		System.out.println("Area: " + (length * width));
	}}
public class Program260 {
	public static void main(String[] args) {
		Rectangle26 rect = new Rectangle26();
		rect.type = "Rectangle";
		rect.color = "Blue";
		rect.length = 10.5;
		rect.width = 5.0;
		System.out.println("Rectangle Information:");
		rect.showRectangleDetails();
	}
}