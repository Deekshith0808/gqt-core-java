package arrays;

import java.util.Scanner;

class ArrayOpe1{
	String arr[][];
	Scanner sc = new Scanner(System.in);
	void createArray() {
		System.out.println("Enter class count: ");
		int cls = sc.nextInt();
		arr = new String[cls][];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the count of students inside the class no "+(i+1));
			arr[i] = new String[sc.nextInt()];
		}
		System.out.println("Array is created");
		System.out.println("-----------------");
	}
	void collectData() {
		for (int i =0;i<arr.length;i++) {
			System.out.println("Inside class no: "+(i+1));
			for(int j =0;j<arr[i].length;j++) { 
				System.out.println("Enter the name of student no: "+(j+1));
				arr[i][j] = sc.next();
			}
		}
		System.out.println("Data collected");
		System.out.println("-----------------");
	}
	void display() {
		for (int i =0;i<arr.length;i++) {
			System.out.println("Inside class no: "+(i+1));
			for(int j =0;j<arr[i].length;j++) {
				System.out.println("Enter the name of student "+(j+1)+ " is = " +arr[i][j]);
			}
		}
	}
}
public class UnevenInputs_Twodimensional {

	public static void main(String[] args) {
		ArrayOpe1 ao = new ArrayOpe1();
		ao.createArray();
		ao.collectData();
		ao.display();
	}

}
