package gqt375;
/**
 * @author sai deekshith
 */
import java.util.Scanner;
public class Program150 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of sides (n): ");
		int n = sc.nextInt();
		System.out.print("Enter the length of one side (s): ");
		double s = sc.nextDouble();
		if (n < 3) {
			System.out.println("A polygon must have at least 3 sides.");
		} else {
			double area = (n * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / n));
			System.out.printf("The area of the regular polygon is: %.2f\n", area);
		}
	}
}
