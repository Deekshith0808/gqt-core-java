package gqt375;
/**
 * @author sai deekshith
 */
import java.util.Scanner;
public class Program282 {
	public static void main(String[] args){
		Scanner scanner=new Scanner("");
		try{
			System.out.println("Enter something:");
			String input=scanner.next();
			System.out.println("You entered: "+input);
		}catch(Exception e){
			System.out.println("NoSuchElementException is handled!");
		}
	}
}
