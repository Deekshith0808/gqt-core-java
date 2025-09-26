package gqt375;
/**
 * @author sai deekshith
 */
import java.util.Collections;
import java.util.List;
public class Program284 {
	public static void main(String[] args){
		List<String> list=Collections.emptyList();
		try{
			list.add("Hello");
		}catch(Exception e){
			System.out.println("UnsupportedOperationException is handled!");
		}
	}
}