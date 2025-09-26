package gqt375;
/**
 * @author sai deekshith
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class P116 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = sc.nextLine();
		input = input.toLowerCase();
		HashMap<Character, Integer> charCountMap = new HashMap<>();
		for (char ch : input.toCharArray()) {
			if (ch != ' ') { // ignore spaces
				charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
			}
		}
		System.out.println("Duplicate characters in the string:");
		boolean found = false;
		for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + " : " + entry.getValue());
				found = true;
			}
		}
		if (!found) {
			System.out.println("No duplicate characters found.");
		}
	}
}