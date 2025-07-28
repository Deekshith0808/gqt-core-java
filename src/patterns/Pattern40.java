package patterns;
import java.util.Scanner;
public class Pattern40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int s = 1; s <= rows - i; s++) {
                System.out.print(" ");
            }
            if (i == 1) {
                System.out.println("1");
            } else {
                System.out.print(i);
                for (int space = 1; space <= 2 * i - 3; space++) {
                    System.out.print(" ");
                }
                System.out.println(i);
            }
        }

        for (int i = rows - 1; i >= 1; i--) {
            for (int s = 1; s <= rows - i; s++) {
                System.out.print(" ");
            }
            if (i == 1) {
                System.out.println("1");
            } else {
                System.out.print(i);
                for (int space = 1; space <= 2 * i - 3; space++) {
                    System.out.print(" ");
                }
                System.out.println(i);
            }
        }

        sc.close();
    }
}