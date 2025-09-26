package gqt375;
/**
 * @author sai deekshith
 */
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.ArrayList;
public class Program281 {
	public static void main(String[] args) throws Exception{
		ArrayList<String> list=new ArrayList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Cherry");
		list.add("Mango");
		list.add("Grapes");
		System.out.println("Initial List: "+list);
		try{
			Iterator<String> iterator=list.iterator();
			iterator.remove();
		}catch(Exception el){
			System.out.println("Exception caught: "+el);
		}
		System.out.println("Final List: "+list);
	}
}
