package gqt375;
/**
 * @author sai deekshith
 */

public class Program189 {
	public static double volume(double radius, double height) {
		return Math.PI * radius * radius * height;
	}
	public static void main(String[] args) {
		System.out.println("Volume of cylinder: " + volume(5, 10));
	}
}
