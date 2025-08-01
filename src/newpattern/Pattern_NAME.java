/**
 * 
 */
package newpattern;

import java.util.Scanner;

/**
 * 
 */
public class Pattern_NAME {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int n = sc.nextInt();
		for(int i =0;i<n;i++) {
			for(int j =0;j<n;j++)
				if(j==0||(i==0 && j!=n-1)||(j==n-1 && i!=0 && i!=n-1)||(i==n-1 && j!=n-1)) {				//D
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			System.out.print("   ");
			
				for(int j =0;j<n;j++)
					if(i==0||j==0||i==n-1||i==n/2){															//E
						System.out.print("# ");
					}
					else {
						System.out.print("  ");
					}
				System.out.print("   ");
				for(int j =0;j<n;j++)
					if(i==0||j==0||i==n-1||i==n/2) {														//E
						System.out.print("# ");
					}
					else {
						System.out.print("  ");
					}
				System.out.print("   ");
				for(int j =0;j<n;j++)
					if(j==0||i+j==n/2||i-j==n/2) {															//K
						System.out.print("# ");
					}
					else {
						System.out.print("  ");
					}
				for(int j =0;j<n;j++)
					if(i==0||i==n/2||i==n-1||(j==0 && i<n/2)||(j==n-1 && i>=n/2)) {							//S
						System.out.print("# ");
					}
					else {
						System.out.print("  ");
					}
				System.out.print("   ");
				for(int j =0;j<n;j++)
					if(i==n/2||j==0||j==n-1) {																//H
						System.out.print("# ");
					}
					else {
						System.out.print("  ");
					}
				System.out.print("   ");
				for(int j =0;j<n;j++)
					if(i==0||j==n/2||i==n-1) {																//I
						System.out.print("# ");
					}
					else {
						System.out.print("  ");
					}
				System.out.print("   ");
				for(int j =0;j<n;j++)
					if(i==0||j==n/2) {																		//T
						System.out.print("# ");
					}
					else {
						System.out.print("  ");
					}
				System.out.print("   ");
				for(int j =0;j<n;j++)
					if(i==n/2||j==0||j==n-1) {																//H
						System.out.print("# ");
					}
					else {
						System.out.print("  ");
					}
				System.out.print("   ");
				System.out.println();

		}

	}
}
