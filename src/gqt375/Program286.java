package gqt375;
/**
 * @author sai deekshith
 */
public class Program286 {
	public static void main(String[] args){
		try{
			checkNumber(-10);
		}catch(IllegalArgumentException e){
			System.out.println("handled IllegalArgumentException");
		}
	}
	public static void checkNumber(int num){
		if(num<0){
			throw new IllegalArgumentException("handled IllegalArgumentException");
		}
		System.out.println("Valid number: "+num);
	}
}