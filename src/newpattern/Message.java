/**
 * 
 */
package newpattern;

import java.util.Scanner;

/**@author sai deekshith
 * @category
 */
public class Message {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the size: ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0||j==n/2) {																	//T
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			for(int j =0;j<n;j++)
				if(i==n/2||j==0||j==n-1) {															//H
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			for(int j =0;j<n;j++){
				if(j==0 && i>=n/2||i+j==n/2||j-i==n/2||j==n-1 && i>n/2||i==n/2) {					//A
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			for(int j =0;j<n;j++)
				if(j==0||(i==j )||j==n-1) {															//N
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			for(int j =0;j<n;j++)
				if(j==0||i+j==n/2||i-j==n/2) {														//K
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			System.out.print("	");
			for(int j =0;j<n;j++)
				if((i==j && i<=n/2)||(i+j==n-1 && i<=n/2)||(j==n/2 && i>=n/2)) {					//Y
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			for(int j =0;j<n;j++)
				if(j==0||i==0||i==n-1||j==n-1) {													//O
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			for(int j =0;j<n;j++)
				if(j==0||i==n-1||j==n-1) {															//U
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			System.out.print("	 ");
			for(int j =0;j<n;j++)
				if(i==0||j==0||i==n-1||(j==n-1 && i>=n/2)||(i==n/2 && j>=n/2)) {					//G
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				} 
			System.out.print(" ");
			for(int j =0;j<n;j++)
				if(j==0||i==n-1||j==n-1) {															//U
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			System.out.print("	");
			for(int j =0;j<n;j++)
				if(j==0||i==0||(j==n-1 && i<=n/2)||(i==n/2 && j>=n/2)||(i==j && i>=n/2)) {			//R
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			System.out.print(" ");
			for(int j =0;j<n;j++)
				if(j==0||i==n-1||j==n-1) {															//U
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			for(int j =0;j<n;j++)
				if((j==0 && i<=n/2)||i-j==n/2||(j==n-1 && i<=n/2)||i+j==(n-1)+(n/2)) {				//V
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			for(int j =0;j<n;j++){
				if(j==0 && i>=n/2||i+j==n/2||j-i==n/2||j==n-1 && i>n/2||i==n/2) {					//A
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}			
			}
			System.out.println();
		}
		sc.close();
	}
}