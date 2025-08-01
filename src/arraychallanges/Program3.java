package arraychallanges;

import java.util.Scanner;
public class Program3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        // Declare source and destination arrays
        int[] sourceArray = new int[n];
        int[] destinationArray = new int[n];

        // Input elements into the source array
        System.out.println("Enter " + n + " elements into the source array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            sourceArray[i] = sc.nextInt();
        }

        // Copy elements from sourceArray to destinationArray
        for (int i = 0; i < n; i++) {
            destinationArray[i] = sourceArray[i];
        }

        // Display the copied array
        System.out.println("\nElements copied to destination array:");
        for (int i = 0; i < n; i++) {
            System.out.println("Element " + (i + 1) + ": " + destinationArray[i]);
        }

        sc.close();
    }
}
