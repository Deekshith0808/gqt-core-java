package gqt375;
/**
 * @author sai deekshith
 */
public class Program203 {
	public static String reverseString(String str) {
		if (str.length() <= 1) return str;
		return reverseString(str.substring(1)) + str.charAt(0);
	}
	public static void main(String[] args) {
		String original = "Hello";
		String reversed = reverseString(original);
		System.out.println("Reversed string: " + reversed);
	}}