package patterns;

import java.util.Scanner;

public class Pattern25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int n = sc.nextInt();
		int l =1;
		for (int i=1;i<=n;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print(l+" ");
				l++;
			}
			System.out.println();
		}

	}

}
