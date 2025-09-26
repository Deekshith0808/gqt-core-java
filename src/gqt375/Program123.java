package gqt375;
/**
 * @author sai deekshith
 */
import java.util.Scanner;
public class Program123 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		String input = sc.nextLine();
		input = input.toLowerCase();
		boolean[] alphabet = new boolean[26];
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				alphabet[ch - 'a'] = true;
			}
		}
		boolean isPangram = true;
		for (boolean b : alphabet) {
			if (!b) {
				isPangram = false;
				break;
			}
		}
		if (isPangram) {
			System.out.println("The string is a pangram.");
		} else {
			System.out.println("The string is NOT a pangram.");
		}
	}
}