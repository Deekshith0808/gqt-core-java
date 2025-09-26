package gqt375;
/**
 * @author sai deekshith
 */
public class Program188 {
	public static double calculate(double principal, double rate, double time) {
		return (principal * rate * time) / 100;
	}
	public static void main(String[] args) {
		System.out.println("Simple interest: " + calculate(1000, 5, 2));
	}
}