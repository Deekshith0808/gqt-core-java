package gqt375;
/**
 * @author sai deekshith
 */
import java.util.Scanner;
public class Program142 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius of the sphere: ");
		double radius = sc.nextDouble();
		double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
		System.out.printf("The volume of the sphere is: %.2f\n", volume);
	}
}

