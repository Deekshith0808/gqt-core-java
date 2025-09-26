package gqt375;
/**
 * @author sai deekshith
 */
import java.util.Scanner;
public class P102 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = sc.nextLine();
		String cleanInput = input.replaceAll("\\s+", "").toLowerCase();
		String reversed = "";
		for (int i = cleanInput.length() - 1; i >= 0; i--) {
			reversed += cleanInput.charAt(i);
		}
		if (cleanInput.equals(reversed)) {
			System.out.println("The string is a palindrome.");
		} else {
			System.out.println("The string is not a palindrome.");
		}
	}
}

