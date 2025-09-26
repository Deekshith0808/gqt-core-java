package gqt375;
/**
 * @author sai deekshith
 */
import java.util.Scanner;
public class P111 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = sc.nextLine();
		boolean found = false;
		for (int i = 0; i < input.length(); i++) {
			char currentChar = input.charAt(i);
			boolean isRepeated = false;
			for (int j = 0; j < input.length(); j++) {
				if (i != j && currentChar == input.charAt(j)) {
					isRepeated = true;
					break;
				}
			}
			if (!isRepeated) {
				System.out.println("First non-repeated character: " + currentChar);
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("No non-repeated character found.");
		}
	}
}