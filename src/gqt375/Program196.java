package gqt375;
/**
 * @author sai deekshith
 */
public class Program196 {
	public static double calculateArea(double base1, double base2, double height) {
		return 0.5 * (base1 + base2) * height;
	}
	public static void main(String[] args) {
		double b1 = 5.0;
		double b2 = 7.0;
		double h = 4.0;
		double area = calculateArea(b1, b2, h);
		System.out.println("Area of trapezoid: " + area);
	}
}