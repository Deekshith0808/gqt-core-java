package gqt375;
/**
 * @author sai deekshith
 */
class Program161 {
	private double radius;
	public Program161(double radius) {
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
	public double getCircumference() {
		return 2 * Math.PI * radius;
	}
	public static void main(String[] args) {
		Program161 circle = new Program161(5.0);
		System.out.println("Radius: " + circle.getRadius());
		System.out.println("Area: " + circle.getArea());
		System.out.println("Circumference: " + circle.getCircumference());
		circle.setRadius(7.0);
		System.out.println("\nAfter updating radius:");
		System.out.println("Radius: " + circle.getRadius());
		System.out.println("Area: " + circle.getArea());
		System.out.println("Circumference: " + circle.getCircumference());
	}
}