//CUSTOM EXCEPTION

package interfaceprograms;

import java.util.Scanner;

class UnderAgeException extends Exception{
	public String getMessage() {
		return "The age is less than the minimum age. Application cannot be processed";		
	}
}
class OverAgeException extends Exception{
	public String getMessage() {
		return "The age is more than the maximum age. Application cannot be processed";		
	}
}
class Candidate{
	int age;
	void CollectData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age: ");
		age = sc.nextInt();
	}
	void validate() throws UnderAgeException,OverAgeException  {
		if(age < 18) {
			UnderAgeException uae = new UnderAgeException();
			System.out.println(uae.getMessage());
			throw uae;
		}
		else if(age > 60) {
			OverAgeException oae = new OverAgeException();
			System.out.println(oae.getMessage());
			throw oae;
		}
		else {
			System.out.println("Application can be processed");
		}
	}
}
class Matrimony{
	void process(Candidate c) {
		try {
			c.CollectData();
			c.validate();
		}
		catch (OverAgeException | UnderAgeException e1) {
			try {
				c.CollectData();
				c.validate();
			}
			catch (OverAgeException | UnderAgeException e2) {
				try {
					c.CollectData();
					c.validate();
				}
				catch (OverAgeException | UnderAgeException e3) {
					System.out.println("Candidature is blocked");
					System.exit(0);
				}
			}
		}
	}
}
public class Launch6 {
	public static void main(String[] args) {
		Candidate c = new Candidate();
		Matrimony m = new Matrimony();
		m.process(c);
	}
}
