package arraychallanges;

import java.util.Scanner;
public class Program14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of the array
        System.out.print("Enter number of elements (minimum 2): ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Array must have at least 2 elements.");
            return;
        }

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        // Find largest, second largest, smallest, second smallest
        for (int num : arr) {
            // For largest
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }

            // For smallest
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }

        // Check if valid second largest/smallest were found
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element (all elements may be equal).");
        } else {
            System.out.println("Second largest element: " + secondLargest);
        }

        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("No second smallest element (all elements may be equal).");
        } else {
            System.out.println("Second smallest element: " + secondSmallest);
        }

        sc.close();
    }
}