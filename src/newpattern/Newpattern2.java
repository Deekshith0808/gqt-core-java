package newpattern;
import java.util.Scanner;
public class Newpattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if(i==j||j==1||i==n) {
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
