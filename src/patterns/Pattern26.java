package patterns;

import java.util.Scanner;

public class Pattern26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int n = sc.nextInt();
		for(int i = 1;i<=n;i++) {
			for (int j =1;j<=i;j++) {
					if(j%2==1){
						System.out.print("1");
					}
					else
					System.out.print("0");
				}
			System.out.println();
			}
			
		}
	}


