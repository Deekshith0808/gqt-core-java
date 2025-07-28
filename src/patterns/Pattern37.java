package patterns;
import java.util.Scanner;
public class Pattern37 {

	

			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
		        System.out.print("Enter number of rows: ");
		        int rows = sc.nextInt();

		        for (int i = 1; i <= rows; i++) {
		            
		            for (int s = 1; s <= rows - i; s++) {
		                System.out.print(" ");
		            }
		            
		            char start = (char) ('a' + i - 1);

		            for (char ch = start; ch >= 'a'; ch--) {
		                System.out.print(ch);
		            }

		            
		            for (char ch = 'b'; ch <= start; ch++) {
		                System.out.print(ch);
		            }

		            System.out.println();
		        }

		        sc.close();

			}

		

	}


