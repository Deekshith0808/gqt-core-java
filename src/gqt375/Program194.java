package gqt375;
/**
 * @author sai deekshith
 */
public class Program194 {
	public static double calculateArea(double base, double height) {
		return base * height;
	}
	public static void main(String[] args) {
		double b = 10.0;
		double h = 5.0;
		double area = calculateArea(b, h);
		System.out.println("Area of parallelogram: " + area);
	} 
}