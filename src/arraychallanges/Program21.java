package arraychallanges;

import java.util.Scanner;

public class Program21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows and columns:");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] a = new int[r][c];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Row-wise sum:");
        for (int i = 0; i < r; i++) {
            int rowSum = 0;
            for (int j = 0; j < c; j++) {
                rowSum += a[i][j];
            }
            System.out.println("Row " + (i + 1) + " sum = " + rowSum);
        }

        System.out.println("Column-wise sum:");
        for (int j = 0; j < c; j++) {
            int colSum = 0;
            for (int i = 0; i < r; i++) {
                colSum += a[i][j];
            }
            System.out.println("Column " + (j + 1) + " sum = " + colSum);
        }
    }
}