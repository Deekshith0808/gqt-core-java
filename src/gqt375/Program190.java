package gqt375;
/**
 * @author sai deekshith
 */
public class Program190 {
	public static double calculate(double principal, double rate, double time, int n) {
		return principal * Math.pow((1 + (rate / (100 * n))), (n * time)) - principal;
	}
	public static void main(String[] args) {
		System.out.println("Compound Interest: " + calculate(1000, 5, 2, 1));
	}
}
