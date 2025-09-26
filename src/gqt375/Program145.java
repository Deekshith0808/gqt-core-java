package gqt375;
/**
 * @author sai deekshith
 */
import java.util.Scanner;
public class Program145 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of the first base: ");
		double base1 = sc.nextDouble();
		System.out.print("Enter the length of the second base: ");
		double base2 = sc.nextDouble();
		System.out.print("Enter the height of the trapezoid: ");
		double height = sc.nextDouble();
		double area = 0.5 * (base1 + base2) * height;
		System.out.printf("The area of the trapezoid is: %.2f\n", area);
	}
}

