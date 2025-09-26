package interfaceprograms;

import java.util.Scanner;

public class Launch0 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int n1 = sc.nextInt();	// Critical statement
		System.out.println("Enter the second number : ");
		int n2 = sc.nextInt();	// Critical statement
		
		int res = n1 / n2;	// Critical statement
		System.out.println(res);
	}

}
