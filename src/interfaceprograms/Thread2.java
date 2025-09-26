//SINGLE THREAD

package interfaceprograms;
import java.util.Scanner;

public class Thread2 {
	public static void main(String[] args)  throws InterruptedException{
		System.out.println("Addition Operation Started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter Second number : ");
		int num2 = sc.nextInt();
		int res = num1 + num2;
		System.out.println("Result"+res);
		System.out.println("Addition Operation Completed");
		
		System.out.println("Printing Operation Started");
		for(int i=1; i<=10; i++) {
			System.out.println("Happy 6 years to GQT");
			Thread.sleep(3000);
		}
		System.out.println("Printing OPeration Completed");
		
		System.out.println("Banking Operation Started");
		System.out.println("Enter the Account Number :");
		int accno = sc.nextInt();
		System.out.println("Enter the Pin Number :");
		int pin= sc.nextInt();
		System.out.println("Data Entered");
		System.out.println("Banking Operation Completed");
		
	}
}

