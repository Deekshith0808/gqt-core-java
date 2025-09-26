package gqt375;
/**
 * @author sai deekshith
 */
class Program {
	private double radius;
	public Program(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return Math.PI * radius * radius;
	}
}
public class Program162 {
	public static void main(String[] args) {
		Program circle = new Program(5.0);
		System.out.println("Area: " + circle.getArea());
		circle.setRadius(6.0);
		System.out.println("Updated Area: " + circle.getArea());
	}
}