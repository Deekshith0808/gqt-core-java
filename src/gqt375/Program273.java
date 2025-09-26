package gqt375;
/**
 * @author sai deekshith
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Program273{
	public static void main(String[] args){
		try{
			File file=new File("nonexistent_file.txt");
			Scanner scanner=new Scanner(file);
		}catch(Exception e){
			System.out.println("FileNotFoundException handled");
		}
	}
}