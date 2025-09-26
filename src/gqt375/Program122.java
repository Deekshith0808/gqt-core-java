package gqt375;
/**
 * @author sai deekshith
 */
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Program122 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first string: ");
		String str1 = sc.nextLine();
		System.out.print("Enter the second string: ");
		String str2 = sc.nextLine();
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		Set<Character> set1 = new HashSet<>();
		for (char ch : str1.toCharArray()) {
			if (ch != ' ') { // ignoring spaces
				set1.add(ch);
			}
		}
		Set<Character> common = new HashSet<>();
		for (char ch : str2.toCharArray()) {
			if (set1.contains(ch) && ch != ' ') {
				common.add(ch);
			}
		}
		if (common.isEmpty()) {
			System.out.println("No common characters found.");
		} else {
			System.out.println("Common characters:");
			for (char ch : common) {
				System.out.print(ch + " ");
			}
		}
	}
}

