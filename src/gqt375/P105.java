package gqt375;
/**
 * @author sai deekshith
 */
import java.util.Scanner;
public class P105 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = sc.nextLine();
		String noSpaces = input.replaceAll("\\s+", "");
		System.out.println("String after removing white spaces: " + noSpaces);
	}
}

