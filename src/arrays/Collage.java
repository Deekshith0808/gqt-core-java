package arrays;
import java.util.Scanner;
class Clg{
	String arr[][][];
	long revenue;
	long total_revenue;
	long sum_revenue;
	Scanner sc = new Scanner(System.in);
	void create() {
		System.out.println("Enter collage count: ");
		int clg = sc.nextInt();
		arr = new String[clg][][];		
		for(int i= 0;i<arr.length;i++) {
			System.out.println("Enter count of classrooms in collage no: "+(i+1));
			arr[i] = new String[sc.nextInt()][];
		}		
		for (int i =0;i<arr.length;i++) {
			System.out.println("Inside collage no: "+(i+1));
			for(int j =0;j<arr[i].length;j++) {
				System.out.println("Count of Students in class no:"+(j+1));
				arr[i][j] = new String[sc.nextInt()];
			}
		}
		System.out.println("Array is created.");
		System.out.println("-----------------");
	}
	void collect() {
		for(int i =0;i<arr.length;i++) {
			System.out.println("Inside collage no:"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Inside classroom no:"+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("Enter the name of student:"+(k+1));
					arr[i][j][k] = sc.next();
					System.out.println("Data collected");
					System.out.println("-------------------");
				}
			}
		}
	}
	void display() {
		for(int i =0;i<arr.length;i++) {
			System.out.println("Inside collage no:"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Inside classroom no:"+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("Enter the name of student:"+(k+1)+"is ="+arr[i][j][k]);
					if (i == 0) {
						total_revenue += 2500000;
					} else if (i == 1) {
						total_revenue += 350000;
					} else if (i == 2) {
						total_revenue += 80000;
					}
				}
			}
			System.out.println("Total Revenue for 2024-2025: ₹" + total_revenue);
		}
	}
}
public class Collage {
	public static void main(String[] args) {
		Clg c = new Clg();
		c.create();
		c.collect();
		c.display();
	}
}