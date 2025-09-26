package gqt375;
/**
 * @author sai deekshith
 */
import java.util.Scanner;
public class Program149 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of the first diagonal (d1): ");
		double d1 = sc.nextDouble();
		System.out.print("Enter the length of the second diagonal (d2): ");
		double d2 = sc.nextDouble();
		double area = (d1 * d2) / 2;
		System.out.printf("The area of the rhombus is: %.2f\n", area);
	}
}