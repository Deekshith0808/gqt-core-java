package gqt375;
/**
 * @author sai deekshith
 */
public class Program180 {
	public static long factorial(int n) {
		if (n == 0) return 1;
		long result = 1;
		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println("Factorial of 5: " + factorial(5));
	}
}
