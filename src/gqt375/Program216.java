package gqt375;
/**
 * @author sai deekshith
 */
abstract class Bank {
	abstract void openAccount();
	abstract void closeAccount();
}
class SavingsBank extends Bank {
	@Override
	public void openAccount() {
		System.out.println("Savings Bank account opened.");
	}
	@Override
	public void closeAccount() {
		System.out.println("Savings Bank account closed.");
	}
}
class CurrentBank extends Bank {
	@Override
	public void openAccount() {
		System.out.println("Current Bank account opened.");
	}
	@Override
	public void closeAccount() {
		System.out.println("Current Bank account closed.");
	}}
public class Program216 {
	public static void main(String[] args) {
		Bank savings = new SavingsBank();
		Bank current = new CurrentBank();
		System.out.println("--- SAVINGS BANK ---");
		savings.openAccount();
		savings.closeAccount();
		System.out.println("--- CURRENT BANK ---");
		current.openAccount();
		current.closeAccount();
	}
}
