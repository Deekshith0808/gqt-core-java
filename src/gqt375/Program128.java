package gqt375;
/**
 * @author sai deekshith
 */
import java.util.Scanner;
public class Program128 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of the rectangle: ");
		float length = sc.nextFloat();
		System.out.print("Enter the width of the rectangle: ");
		float width = sc.nextFloat();
		float area = length * width;
		System.out.println("The area of the rectangle is: " + area);
	}
}

