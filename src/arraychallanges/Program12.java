package arraychallanges;

import java.util.Scanner;

public class Program12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int sum = 0;

        // Input array elements
        System.out.println("Enter " + n + " elements (positive or negative):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

            // Add to sum if negative
            if (arr[i] < 0) {
                sum += arr[i];
            }
        }

        // Output the sum of negative numbers
        System.out.println("Sum of all negative numbers: " + sum);

        sc.close();
    }
}