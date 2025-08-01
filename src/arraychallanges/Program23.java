package arraychallanges;

import java.util.Scanner;

public class Program23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] a = new int[3][3];

        System.out.println("Enter 3x3 matrix elements:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        boolean found = false;

        for (int i = 0; i < 3; i++) {
            int min = a[i][0];
            int col = 0;

            for (int j = 1; j < 3; j++) {
                if (a[i][j] < min) {
                    min = a[i][j];
                    col = j;
                }
            }

            boolean isSaddle = true;

            for (int k = 0; k < 3; k++) {
                if (a[k][col] > min) {
                    isSaddle = false;
                    break;
                }
            }

            if (isSaddle) {
                System.out.println("Saddle point: " + min);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No saddle point");
        }
    }
}