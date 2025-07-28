package patterns;
import java.util.Scanner;
public class Pattern29 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int n = sc.nextInt();
		for (int i=1;i<=n;i++) {
			int a =1;
			for(int j =n;j>=i;j--) {
				System.out.print("  ");
			}
			for(int k=1;k<=i-1;k++) {
				System.out.print(a+" ");
				a++;
			}
			for (int h=1;h<=i;h++) {
				System.out.print(a+" ");
				a--;
			}
			System.out.println();
		}
	}

}
