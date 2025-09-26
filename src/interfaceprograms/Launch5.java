//RETHROWING OF EXCEPTION USING THROW KEY WORD

package interfaceprograms;

import java.util.Scanner;

class Operationn1{
	void function1() throws Exception{
		System.out.println("Inside function 1");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int n1 = sc.nextInt();	//critical statement -- InputMismatchException
		System.out.println("Enter the second number : ");
		int n2 = sc.nextInt();	//critical statement -- InputMismatchException
		int res = n1 / n2;	//critical statement -- ArithmeticException
		System.out.println(res);
		System.out.println("Outoff function 1");
	}
}
class Operationn2{
	void function2() throws Exception{
		System.out.println("Inside function 2");
		Operation1 op1 = new Operation1();
		op1.function1();
		System.out.println("Outoff function 2");
	}
}
class Operationn3{
	void function3() throws Exception{
		System.out.println("Inside function 3");
		Operation2 op2 = new Operation2();
		try {
			op2.function2();
		}
		catch(Exception e) {
			System.out.println("Exception handled in function 3");
			throw e;
		}
		System.out.println("Outoff function 3");
	}
}
public class Launch5 {
	public static void main(String[] args) {
		System.out.println("Inside main function");
		Operation3 op3 = new Operation3();
		try {
			op3.function3();
		} catch (Exception e) {
			System.out.println("Exception handled in main");
		}
		op3.function3();
		System.out.println("Outoff main function");
	}
}
