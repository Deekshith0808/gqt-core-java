package gqt375;
/**
 * @author sai deekshith
 */
import java.lang.*;
public class Program279 {
	public static void main(String[] args){
		try{
			Thread thread=new Thread();
			System.out.println("Sleeping for 3 seconds...");
			Thread.sleep(3000);
			thread.interrupt();
			System.out.println("Woke up!");
		}catch(Exception e){
			System.out.println("Sleep was interrupted!");
		}
	}
}