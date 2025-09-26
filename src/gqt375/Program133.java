package gqt375;
/**
 * @author sai deekshith
 */
import java.util.Scanner;
public class Program133 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		double num1 = sc.nextDouble();
		System.out.print("Enter the second number: ");
		double num2 = sc.nextDouble();
		double min = Math.min(num1, num2);
		System.out.println("The minimum of " + num1 + " and " + num2 + " is: " + min);
	}
}
