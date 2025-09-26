//SINGLE THREAD - 2

package interfaceprograms;
import java.util.Scanner;
class Addition{
	void add() {
		System.out.println("Addition Operation Started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter Second number : ");
		int num2 = sc.nextInt();
		int res = num1 + num2;
		System.out.println("Result"+res);
		System.out.println("Addition Operation Completed");
	}
}
class Printing{
	void print() {
		System.out.println("Printing Operation Started");
		for(int i=1; i<=10; i++) {
			System.out.println("Happy 6 years to GQT");

			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Printing Operation Completed");
	}
}
class Banking{
	void bank() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Banking Operation Started");
		System.out.println("Enter the Account Number :");
		int accno = sc.nextInt();
		System.out.println("Enter the Pin Number :");
		int pin= sc.nextInt();
		System.out.println("Data Entered");
		System.out.println("Banking Operation Completed");
	}
}
public class Thread3 {
	public static void main(String[] args) {
		Addition a = new Addition();
		Printing p = new Printing();
		Banking b = new Banking();
		
		a.add();
		p.print();
		b.bank();
	}
}
