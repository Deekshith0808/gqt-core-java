package gqt375;
/**
 * @author sai deekshith
 */
import java.util.Arrays;
import java.util.Scanner;
public class P110 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first string: ");
		String str1 = sc.nextLine();
		System.out.print("Enter the second string: ");
		String str2 = sc.nextLine();
		String s1 = str1.replaceAll("\\s+", "").toLowerCase();
		String s2 = str2.replaceAll("\\s+", "").toLowerCase();
		if (s1.length() != s2.length()) {
			System.out.println("The strings are not anagrams.");
		} else {
			char[] arr1 = s1.toCharArray();
			char[] arr2 = s2.toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			if (Arrays.equals(arr1, arr2)) {
				System.out.println("The strings are anagrams.");
			} else {
				System.out.println("The strings are not anagrams.");
			}
		}
	}
}
