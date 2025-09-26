package gqt375;
/**
 * @author sai deekshith
 */
public class Program193 {
	public static double calculateArea(double diagonal1, double diagonal2) {
		return (diagonal1 * diagonal2) / 2.0; }
	public static void main(String[] args) {
		double d1 = 6.0;
		double d2 = 8.0;
		double area = calculateArea(d1, d2);
		System.out.println("Area of rhombus: " + area);
	}
}
