package arraychallanges;

import java.util.Scanner;
public class Program1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Input the size of the array
		System.out.print("Enter the number of elements: ");
		int n = sc.nextInt();
		// Declare array
		int[] arr = new int[n];
		int sum = 0;
		// Input array elements
		System.out.println("Enter " + n + " elements:");
		for (int i = 0; i < n; i++) {
			System.out.print("Element " + (i + 1) + ": ");
			arr[i] = sc.nextInt();
			sum += arr[i]; // Add each element to sum
			}
		// Display the sum
		System.out.println("Sum of all elements in the array: " + sum);
		sc.close();
		}
	}
