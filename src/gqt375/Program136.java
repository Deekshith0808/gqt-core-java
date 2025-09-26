package gqt375;
/**
 * @author sai deekshith
 */
import java.util.Scanner;
public class Program136 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		double num = sc.nextDouble();
		if (num < 0) {
			System.out.println("Square root of a negative number is not real.");
		} else {
			double sqrt = Math.sqrt(num);
			System.out.printf("The square root of %.2f is: %.4f\n", num, sqrt);
		}
	}
}
