package arraychallanges;

import java.util.Scanner;
public class Program13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        long product = 1; // Use long to handle large results

        // Input elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            product *= arr[i]; // Multiply each element
        }

        // Output the product
        System.out.println("Product of all elements in the array: " + product);

        sc.close();
    }
}