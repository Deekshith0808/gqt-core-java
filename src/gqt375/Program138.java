package gqt375;
/**
 * @author sai deekshith
 */
import java.util.Scanner;
public class Program138 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius of the circle: ");
		double radius = sc.nextDouble();
		double area = Math.PI * radius * radius;
		System.out.printf("The area of the circle is: %.2f\n", area);
	}
}
