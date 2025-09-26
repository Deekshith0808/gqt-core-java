package gqt375;
/**
 * @author sai deekshith
 */
import java.util.Scanner;
public class P112 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = sc.nextLine();
		boolean isOnlyDigits = true;
		for (int i = 0; i < input.length(); i++) {
			if (!Character.isDigit(input.charAt(i))) {
				isOnlyDigits = false;
				break;
			}
		}
		if (isOnlyDigits) {
			System.out.println("The string contains only digits.");
		} else {
			System.out.println("The string does NOT contain only digits.");
		}
	}
}
