package arraychallanges;

import java.util.Scanner;

public class Program20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the matrix:");
        int n = sc.nextInt();

        int[][] a = new int[n][n];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                sum += a[i][j];
            }
        }

        System.out.println("Sum of lower triangle elements = " + sum);
    }
}