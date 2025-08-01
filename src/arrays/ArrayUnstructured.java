package arrays;
import java.util.Scanner;
public class ArrayUnstructured {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the student count: ");
		int n = sc.nextInt();
		//CREATING THE ARRAY TO STORE N STUDENTS MARKS
		int arr[] = new int[n];
		//COLLECTING AND STORING MARKS OF N STUDENTS
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the marks of student no "+(i+1));
			arr[i] = sc.nextInt();
		}
		System.out.println("--------------------");
		//DISPLAY MARKS STORED INSIDE ARRAY
		for(int i=0;i<arr.length;i++) {
			System.out.println("The marks of student no "+(i+1)+" is = "+arr[i]);
		}
	}
}
