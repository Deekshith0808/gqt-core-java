package arrays;
import java.util.Scanner;
class Movie{
	long arr[][][];
	long investment;
	long prev_profit;
	long sum_revenue;
	Scanner sc = new Scanner(System.in);
	void create() {
		System.out.println("Enter language count: ");
		int lan = sc.nextInt();
		System.out.println("Enter catagory count in each language: ");
		int cat = sc.nextInt();
		System.out.println("Enter the movie in each catagory: ");
		int mov = sc.nextInt();
		arr = new long[lan][cat][mov];
		System.out.println("Array is created");
		System.out.println("-------------");
		
		System.out.println("Enter the investment made: ");
		investment = sc.nextLong();
		System.out.println("Enter the profit made in financial year 2024-25 : ");
		prev_profit = sc.nextLong();
		System.out.println("-------------------");
	}
	void collect() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside language no:"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Inside catagory no:"+(j+1));
				for(int k =0;k<arr[i][j].length;k++) {
					System.out.println("The revenue of the movie no"+(k+1));
					arr[i][j][k] = sc.nextLong();
					sum_revenue += arr[i][j][k];
				}
			}
		}
		System.out.println("Data collected and calculated.");
	}
	void display() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside language no:"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Inside catagory no:"+(j+1));
				for(int k =0;k<arr[i][j].length;k++) {
					System.out.println("The revenue of the movie no"+(k+1)+"is = "+arr[i][j][k]);
				}
			}
		}
		System.out.println("--------------------");
		System.out.println("Overall revenue = "+ sum_revenue);
		System.out.println("--------------------");
		if (sum_revenue > investment) {
			long profit = sum_revenue - investment;
			System.out.println("the profit made by Deekshith is = " +profit);
			if(profit > prev_profit) {
				System.out.println("Deekshith has made more profit than previoue year.");
			}
			else {
				System.out.println("Deekshith has made loss than previous year.");
			}
		}
		
	}
}
public class Moivereven {

	public static void main(String[] args) {
		Movie m = new Movie();
		m.create();
		m.collect();
		m.display();

	}

}
