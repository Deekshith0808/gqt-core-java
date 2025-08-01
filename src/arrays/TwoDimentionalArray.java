package arrays;

import java.util.Scanner;

class ArrayOpe{
	String arr[][];
	Scanner sc = new Scanner(System.in);
	void createArray() {
		System.out.println("Enter class count: ");
		int cls = sc.nextInt();
		System.out.println("ENter student count in each class: ");
		int stu = sc.nextInt();
		arr = new String[cls][stu];
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
public class TwoDimentionalArray {

	public static void main(String[] args) {
		ArrayOpe ao = new ArrayOpe();
		ao.createArray();
		ao.collectData();
		ao.display();
	}

}
