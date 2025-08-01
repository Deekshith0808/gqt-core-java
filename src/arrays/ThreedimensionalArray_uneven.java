package arrays;
import java.util.Scanner;
class ArrayOpe3{
	String arr[][][];
	Scanner sc = new Scanner(System.in);
	void create() {
		System.out.println("Enter School count: ");
		int scl = sc.nextInt();
		arr = new String[scl][][];
		
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter count os classes inside school: "+(i+1));
			arr[i] = new String[sc.nextInt()][];
		}
		
		for(int i =0;i<arr.length;i++) {
			System.out.println("Inside school:"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter count of students inside class no: "+(j+1));
				arr [i][j] = new String[sc.nextInt()];
			}
		}
		
		System.out.println("Array is created");
		System.out.println("-------------");
	}
	void collect() {
		for(int i=0;i<arr.length;i++) {
			
			System.out.println("Inside school no:"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Inside class no:"+(j+1));
				for(int k =0;k<arr[i][j].length;k++) {
					System.out.println("Enter the name of the student no"+(k+1));
					arr[i][j][k] = sc.next();
				}
			}
		}
	}
	void display() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside school no:"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Inside class no:"+(j+1));
				for(int k =0;k<arr[i][j].length;k++) {
					System.out.println("Enter the name of the student no"+(k+1)+"is = "+arr[i][j][k]);
				}
			}
		}
	}
}
public class ThreedimensionalArray_uneven {

	public static void main(String[] args) {
		ArrayOpe3 ar = new ArrayOpe3();
		ar.create();
		ar.collect();
		ar.display();

	}

}
