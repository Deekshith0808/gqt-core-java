package gqt375;
/**
 * @author sai deekshith
 */
public class Program287 {
	public static void main(String[] args){
		try{
			System.setSecurityManager(new SecurityManager());
			System.exit(0);
		}
		catch(Exception e){
			System.out.println("SecurityException handled...");
		}
	}
}
