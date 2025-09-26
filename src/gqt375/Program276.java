package gqt375;
/**
 * @author sai deekshith
 */
public class Program276 {
	public static void main(String[] args){
		try{
			Class.forName("com.example.NonExistentClass");
		}catch(Exception e){
			System.out.println("ClassNotFoundException is handled");
		}
	}
}