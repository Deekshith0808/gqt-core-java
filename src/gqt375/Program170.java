package gqt375;
/**
 * @author sai deekshith
 */
import java.util.Scanner;
public class Program170 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a decimal number: ");
		int n = sc.nextInt();
		int count = 0;
		if (n < 0) {
			n = -n;
		}
		while (n > 0) {
			n /= 10;
			count++;
		}
		System.out.println(count);
		sc.close();
	}
}