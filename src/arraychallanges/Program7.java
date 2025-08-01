package arraychallanges;

import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] freq = new int[n]; // to store frequency
        boolean[] visited = new boolean[n]; // to track visited elements

        // Input elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            visited[i] = false;
        }

        // Find frequency
        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                continue; // skip already counted
            }

            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true; // mark duplicate as visited
                }
            }
            freq[i] = count;
        }

        // Display frequency
        System.out.println("\nFrequency of each element:");
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                System.out.println(arr[i] + " occurs " + freq[i] + " time(s)");
            }
        }

        sc.close();
    }
}