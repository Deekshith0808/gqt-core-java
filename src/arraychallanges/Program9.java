package arraychallanges;

import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input first array
        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        // Input second array
        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        // Find intersection (avoid duplicates)
        System.out.println("\nIntersection of the two arrays:");
        for (int i = 0; i < n1; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (arr1[i] == arr1[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (isDuplicate) continue;

            for (int j = 0; j < n2; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    break;
                }
            }
        }

        sc.close();
    }
}