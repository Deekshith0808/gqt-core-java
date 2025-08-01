package arraychallanges;

import java.util.Arrays;
import java.util.Scanner;

public class Program24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of the array:");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the value of k:");
        int k = sc.nextInt();

        if(k > size || k <= 0) {
            System.out.println("Invalid value of k. It should be between 1 and " + size);
            return;
        }

        Arrays.sort(arr);

        int kthSmallest = arr[k - 1];
        int kthLargest = arr[size - k];

        System.out.println("Kth smallest element: " + kthSmallest);
        System.out.println("Kth largest element: " + kthLargest);
    }
}