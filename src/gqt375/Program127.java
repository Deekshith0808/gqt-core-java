package gqt375;
/**
 * @author sai deekshith
 */
import java.util.Scanner;
public class Program127 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first float number: ");
		float num1 = sc.nextFloat();
		System.out.print("Enter the second float number: ");
		float num2 = sc.nextFloat();
		float sum = num1 + num2;
		System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
	}
}
