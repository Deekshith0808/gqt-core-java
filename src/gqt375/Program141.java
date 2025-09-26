package gqt375;
/**
 * @author sai deekshith
 */
import java.util.Scanner;
public class Program141{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter temperature in Fahrenheit: ");
		double fahrenheit = sc.nextDouble();
		double celsius = (fahrenheit - 32) * 5 / 9;
		System.out.printf("%.2f Fahrenheit = %.2f Celsius\n", fahrenheit, celsius);
		sc.close();
	}
}