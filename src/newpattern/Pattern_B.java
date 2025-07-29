/**
 * 
 */
package newpattern;
import java.util.Scanner;
/**@author sai deekshith
 * @category
 */
public class Pattern_B {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the size: ");
				int n = sc.nextInt();
				for(int i =0;i<n;i++) {
					for(int j =0;j<n;j++) {
						if((i==0 && j!=n-1)||(j==n-1 && i!=0 && i!=n-1 && i!=n/2)||
								j==0||(i==n-1 && j!=n-1)||(i==n/2 && j!=n-1)) {
							System.out.print("# ");
						}
						else {
							System.out.print("  ");
						}
					}
					System.out.println();
				}

	}
}



