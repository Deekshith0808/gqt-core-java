package gqt375;
/**
 * @author sai deekshith
 */
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
public class Program121 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = sc.nextLine();
		Set<Character> seen = new LinkedHashSet<>();
		for (char ch : input.toCharArray()) {
			seen.add(ch); // Automatically ignores duplicates
		}
		StringBuilder result = new StringBuilder();
		for (char ch : seen) {
			result.append(ch);
		}
		System.out.println("String after removing duplicates: " + result.toString());
	}
}