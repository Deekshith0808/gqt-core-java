/**@author sai deekshith
 * @catogary
 * @
 */
package newpattern;
import java.util.Scanner;
/**
 * 
 */
public class Newpattern3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print("- ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}

}
