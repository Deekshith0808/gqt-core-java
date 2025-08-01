package arrays;
import java.util.Scanner;
class ArrayOperations{
	int arr[];
	Scanner sc = new Scanner(System.in);
	void createArray() {
		System.out.println("Enter the students count: ");
		int n = sc.nextInt();
		arr = new int[n];
		System.out.println("Array created");
	}
	void collectData() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the marks of student no "+(i+1));
			arr[i] = sc.nextInt();
		}
		System.out.println("Data stored into the array: ");
	}
	void display() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("The marks of student no "+(i+1)+" is = "+arr[i]);
		}
	}
}
public class ArrayStructured {

	public static void main(String[] args) {
		ArrayOperations ao = new ArrayOperations();
		ao.createArray();
		ao.collectData();
		ao.display();
	}

}
