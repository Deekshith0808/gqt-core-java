package gqt375;
/**
 * @author sai deekshith
 */
import java.util.InputMismatchException;
import java.util.Scanner;
public class Program274{
	public static void main(String[] args) {
		String input = "abc123"; // Invalid number string
		try {
			int number = Integer.parseInt(input);
			System.out.println("Converted Number: " + number);
		} catch (NumberFormatException e) {
			System.out.println("Error: Invalid number format - " + e.getMessage());
		}
		System.out.println("Program continues after exception handling.");
	}
}