package gqt375;
/**
 * @author sai deekshith
 */
public class Program201 {
	public static int power(int base, int exponent) {
		if (exponent == 0) return 1;
		return base * power(base, exponent - 1);
	}
	public static void main(String[] args) {
		int base = 3;
		int exponent = 3;
		int result = power(base, exponent);
		System.out.println(base + " raised to the power of " + exponent + " is " + result);
	}
}