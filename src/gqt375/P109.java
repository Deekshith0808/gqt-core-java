package gqt375;
/**
 * @author sai deekshith
 */
import java.util.Scanner;
public class P109 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		String input = sc.nextLine();
		String[] words = input.split("\\s+");
		String longestWord = "";
		int maxLength = 0;
		for (String word : words) {
			if (word.length() > maxLength) {
				maxLength = word.length();
				longestWord = word;
			}
		}
		System.out.println("The longest word is: " + longestWord);
		System.out.println("Length of the longest word: " + maxLength);
	}
}

