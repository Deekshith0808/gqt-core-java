package gqt375;
/**
 * @author sai deekshith
 */
abstract class Bank8 {
	abstract void openAccount();
	abstract void closeAccount();
}
class SavingsBank8 extends Bank8 {
	@Override
	void openAccount() {
		System.out.println("Opening a Savings Bank Account with interest benefits.");
	}
	@Override
	void closeAccount() {
		System.out.println("Closing Savings Bank Account after verification.");
	}}
class CurrentBank8 extends Bank8 {
	@Override
	void openAccount() {
		System.out.println("Opening a Current Bank Account with overdraft facility.");
	}
	@Override
	void closeAccount() {
		System.out.println("Closing Current Bank Account after balance settlement.");
	}}
public class Program228 {
	public static void main(String[] args) {
		Bank8 sb = new SavingsBank8();
		Bank8 cb = new CurrentBank8();
		System.out.println("-- Savings Bank Operations --");
		sb.openAccount();
		sb.closeAccount();
		System.out.println("\n -- Current Bank Operations --");
		cb.openAccount();
		cb.closeAccount();
	}
}
