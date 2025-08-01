package arraychallanges;

import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input first sorted array
        System.out.print("Enter size of first sorted array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter " + n1 + " sorted elements for first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        // Input second sorted array
        System.out.print("Enter size of second sorted array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter " + n2 + " sorted elements for second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        // Merge arrays
        int[] merged = new int[n1 + n2];
        int i = 0, j = 0, k = 0;

        // Compare elements and merge
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

        // Add remaining elements from arr1
        while (i < n1) {
            merged[k++] = arr1[i++];
        }

        // Add remaining elements from arr2
        while (j < n2) {
            merged[k++] = arr2[j++];
        }

        // Display merged array
        System.out.println("\nMerged Sorted Array:");
        for (int x = 0; x < merged.length; x++) {
            System.out.print(merged[x] + " ");
        }

        sc.close();
    }
}