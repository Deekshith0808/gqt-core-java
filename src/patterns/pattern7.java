//pattern-7
package patterns;
import java.util.Scanner;
public class pattern7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int n = sc.nextInt();
		int i =1;
		for (i=1;i<=n;i++) {
			System.out.print(i+" " );
		}
	}

}
