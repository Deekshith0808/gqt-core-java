package gqt375;
/**
 * @author sai deekshith
 */
import java.util.Scanner;
public class P104 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = sc.nextLine();
		System.out.print("Enter a character to count: ");
		char ch = sc.next().charAt(0);
		int count = 0;
		input = input.toLowerCase();
		ch = Character.toLowerCase(ch);
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == ch) {
				count++;
			}
		}
		System.out.println("The character '" + ch + "' appears " + count + " times.");
	}
}