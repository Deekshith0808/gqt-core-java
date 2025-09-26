package gqt375;
/**
 * @author sai deekshith
 */
import java.util.Scanner;
public class Program148 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the side of the square: ");
		double side = sc.nextDouble();
		double area = side * side;
		System.out.printf("The area of the square is: %.2f\n", area);
	}
}
