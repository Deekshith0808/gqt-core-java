
/**
 * 
 */
package newpattern;
import java.util.Scanner;
/**
 * @author Sujal
 * @category New Patterns
 * @Description This is an example for conditional pattern 
 */
public class Newpattern1 {

	/**
	 * @param args
	 * Description This contains source code for the pattern
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size: ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || i==(n-1) || j==0 || j==(n-1)) {
					
				System.out.print("# ");
		}
		
		else {
		
				System.out.print("- ");
			}
		}
		System.out.println();

	}

	}
}
