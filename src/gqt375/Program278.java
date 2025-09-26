package gqt375;
/**
 * @author sai deekshith
 */
import java.util.Scanner;
public class Program278 {
	public static void main(String[] args){
		try{
			System.out.println("Array Operations Started");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the size of the array:");
			int size=sc.nextInt();
			int arr[]=new int[size];
		}catch(Exception e){
			System.out.println("NegativeArraySizeException is handled");
		}
	}
}
