package gqt375;
/**
 * @author sai deekshith
 */
import java.util.HashSet;
import java.util.Scanner;
public class P117 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = sc.nextLine();
		input = input.toLowerCase();
		HashSet<Character> seen = new HashSet<>();
		boolean found = false;
		for (char ch : input.toCharArray()) {
			if (ch != ' ') { // ignore spaces
				if (seen.contains(ch)) {
					System.out.println("First repeating character: " + ch);
					found = true;
					break;
				} else {
					seen.add(ch);
				}
			}
		}
		if (!found) {
			System.out.println("No repeating characters found.");
		}
	}
}

