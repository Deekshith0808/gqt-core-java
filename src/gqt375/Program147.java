package gqt375;
/**
 * @author sai deekshith
 */
import java.util.Scanner;
public class Program147 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the principal amount: ");
		double principal = sc.nextDouble();
		System.out.print("Enter the annual interest rate (in %): ");
		double rate = sc.nextDouble();
		System.out.print("Enter the time (in years): ");
		double time = sc.nextDouble();
		double simpleInterest = (principal * rate * time) / 100;
		System.out.printf("Simple Interest = %.2f\n", simpleInterest);
		System.out.printf("Total Amount = %.2f\n", principal + simpleInterest);
	}
}