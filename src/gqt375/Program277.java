package gqt375;
/**
 * @author sai deekshith
 */
public class Program277 {
	public static void main(String[] args){
		try{
			causeStackOverflow();
		}catch(StackOverflowError e){
			System.out.println("StackOverflowError is handled!");
		}
	}
	public static void causeStackOverflow(){
		causeStackOverflow();
	}
}