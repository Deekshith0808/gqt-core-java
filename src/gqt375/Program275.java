package gqt375;
/**
 * @author sai deekshith
 */
import java.io.BufferedReader;
import java.io.FileReader;
public class Program275{
	public static void main(String[] args){
		try{
			BufferedReader reader=new BufferedReader(new FileReader("nonexistent.txt"));
			System.out.println(reader.readLine());
			reader.close();
		}catch(Exception e){
			System.out.println("IOException handled");
		}
	}
}