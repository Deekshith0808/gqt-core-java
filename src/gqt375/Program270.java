package gqt375;
/**
 * @author sai deekshith
 */
import java.util.Scanner;
public class Program270{
	public static void main(String[] args){
		try{
			System.out.println("Array Operations Started");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the size of the array:");
			int size=sc.nextInt();
			int arr[]=new int[size];
			System.out.println("Enter the value to be added");
			int val=sc.nextInt();
			System.out.println("Enter the position to which the value has to be added");
			int pos=sc.nextInt();
			arr[pos]=val;
			System.out.println("Array operation completed");
		}catch(Exception e){
			System.out.println("ArrayIndexOutOfBoundsException is handled");
		}
	}
}
