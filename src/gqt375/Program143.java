package gqt375;
/**
 * @author sai deekshith
 */
import java.util.Scanner;
public class Program143 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements in the array: ");
		int size = sc.nextInt();
		int[] numbers = new int[size];
		int sum = 0;
		System.out.println("Enter " + size + " integers:");
		for (int i = 0; i < size; i++) {
			numbers[i] = sc.nextInt();
			sum += numbers[i];
		}
		double average = (double) sum / size;
		System.out.printf("The average of the array elements is: %.2f\n", average);
	}
}
