package patterns;

import java.util.Scanner;

public class Pattern32 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int n = sc.nextInt();
		for (int i=1;i<=n;i++) {
			for(int j =n;j>=i;j--) {
				System.out.print("  ");
			}
			for(int k=1;k<=(i*2)-1;k++) {
				System.out.print(i+" ");
				
			}
			System.out.println();
		}
		sc.close();
	}
}
