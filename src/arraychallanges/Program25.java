package arraychallanges;

import java.util.Scanner;

public class Program25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        for(int i = 0; i < size; i++) {
            if(arr[i] > 0) {
                positiveCount++;
            } else if(arr[i] < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        System.out.println("Number of positive elements: " + positiveCount);
        System.out.println("Number of negative elements: " + negativeCount);
        System.out.println("Number of zero elements: " + zeroCount);
    }
}