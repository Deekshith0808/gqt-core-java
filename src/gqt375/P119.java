package gqt375;
/**
 * @author sai deekshith
 */
import java.util.Scanner;
public class P119 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first string: ");
		String str1 = sc.nextLine();
		System.out.print("Enter the second string: ");
		String str2 = sc.nextLine();
		if (str1.length() != str2.length()) {
			System.out.println("The strings are NOT rotations of each other.");
		} else {
			String combined = str1 + str1;
			if (combined.contains(str2)) {
				System.out.println("The strings ARE rotations of each other.");
			} else {
				System.out.println("The strings are NOT rotations of each other.");
			}
		}
	}
}
