package arraychallanges;

import java.util.Scanner;
public class Program2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Input the size of the array
		System.out.print("Enter the number of elements: ");
		int n = sc.nextInt();
		// Declare array
		int[] arr = new int[n];
		// Input array elements
		System.out.println("Enter " + n + " elements:");
		for (int i = 0; i < n; i++) {
			System.out.print("Element " + (i + 1) + ": ");
			arr[i] = sc.nextInt();
			}
		// Initialize min and max with the first element
		int smallest = arr[0];
		int largest = arr[0];
		// Traverse the array to find smallest and largest
		for (int i = 1; i < n; i++) {
			if (arr[i] < smallest) {
				smallest = arr[i];
				}
			if (arr[i] > largest) {
				largest = arr[i];
				}
			}
		// Output results
		System.out.println("Smallest element: " + smallest);
		System.out.println("Largest element: " + largest);
		sc.close();
		}
	}