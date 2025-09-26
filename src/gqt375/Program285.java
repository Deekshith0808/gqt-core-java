package gqt375;
/**
 * @author sai deekshith
 */
import java.util.ArrayList;
import java.util.Iterator;
public class Program285 {
	public static void main(String[] args){
		ArrayList<String> list=new ArrayList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Cherry");
		list.add("Mango");
		list.add("Grapes");
		System.out.println("Initial List: "+list);
		try{
			Iterator<String> iterator=list.iterator();
			while(iterator.hasNext()){
				String fruit=iterator.next();
				System.out.println("Processing: "+fruit);
				if(fruit.equals("Banana")){
					list.remove(fruit);
				}
			}
		}catch(Exception e){
			System.out.println("Exception caught: "+e);
		}
		System.out.println("Final List: "+list);
	}
}