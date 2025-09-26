package gqt375;
/**
 * @author sai deekshith
 */
import java.util.Scanner;
public class Program271 {
	public static void main(String[] args){
		try{
			Scanner sc=new Scanner(System.in);
			System.out.println("Division operation started");
			System.out.println("Enter num1 : ");
			int num1=sc.nextInt();
			System.out.println("Enter num2 : ");
			int num2=sc.nextInt();
			int res=num1/num2;
			System.out.println("result = "+res);
			System.out.println("Division operation completed");
		}catch(Exception e){
			System.out.println("ArithmeticException is handled");
		}
	}
}

