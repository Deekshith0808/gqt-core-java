package arrays;
import java.util.Scanner;
class ArrayOpe2{
	String arr[][][];
	Scanner sc = new Scanner(System.in);
	void create() {
		System.out.println("Enter School count: ");
		int scl = sc.nextInt();
		System.out.println("Enter class count: ");
		int cls = sc.nextInt();
		System.out.println("Enter the students in each class: ");
		int stu = sc.nextInt();
		arr = new String[scl][cls][stu];
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
public class ThreedimensionalArray {

	public static void main(String[] args) {
		ArrayOpe2 ar = new ArrayOpe2();
		ar.create();
		ar.collect();
		ar.display();

	}

}
