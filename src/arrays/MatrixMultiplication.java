package arrays;
import java.util.Scanner;
public class MatrixMultiplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Input dimensions for the first matrix
        System.out.print("Enter number of rows for first matrix: ");
        int rows1 = sc.nextInt();
        System.out.print("Enter number of columns for first matrix: ");
        int cols1 = sc.nextInt();
        // Input dimensions for the second matrix
        System.out.print("Enter number of rows for second matrix: ");
        int rows2 = sc.nextInt();
        System.out.print("Enter number of columns for second matrix: ");
        int cols2 = sc.nextInt();
        // Check if matrix multiplication is possible
        if (cols1 != rows2) {
            System.out.println("Matrix multiplication is not possible.");
            System.out.println("Columns of first matrix must equal rows of second matrix.");
            
        }
         // Declare matrices
            int[][] matrix1 = new int[rows1][cols1];
            int[][] matrix2 = new int[rows2][cols2];
            int[][] result = new int[rows1][cols2];

            // Input elements of first matrix
            System.out.println("\nEnter elements of first matrix:");
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < cols1; j++) {
                    System.out.print("Element [" + i + "][" + j + "]: ");
                    matrix1[i][j] = sc.nextInt();
                }
            }
         // Input elements of second matrix
            System.out.println("\nEnter elements of second matrix:");
            for (int i = 0; i < rows2; i++) {
                for (int j = 0; j < cols2; j++) {
                    System.out.print("Element [" + i + "][" + j + "]: ");
                    matrix2[i][j] = sc.nextInt();
                }
            }

            // Matrix multiplication logic
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < cols2; j++) {
                    for (int k = 0; k < cols1; k++) {
                        result[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }
         // Display result matrix
            System.out.println("\nResultant Matrix after Multiplication:");
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < cols2; j++) {
                    System.out.print(result[i][j] + "\t");
                }
                System.out.println();
            }

            sc.close();
            }
	}