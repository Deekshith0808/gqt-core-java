package gqt375;
/**
 * @author sai deekshith
 */
abstract class BankAccount61 {
	double balance;
	BankAccount61(double balance) {
		this.balance = balance;
	}
	abstract void deposit(double amount);
	abstract void withdraw(double amount);
	void displayBalance() {
		System.out.println("Current Balance: ₹" + balance);
	}
}
class SavingsAccount61 extends BankAccount61 {
	final double MIN_BALANCE = 500;
	SavingsAccount61(double balance) {
		super(balance);
	}
	void deposit(double amount) {
		balance += amount;
		System.out.println("Deposited ₹" + amount + " to Savings Account.");
	}
	void withdraw(double amount) {
		if (balance - amount >= MIN_BALANCE) {
			balance -= amount;
			System.out.println("Withdrew ₹" + amount + " from Savings Account.");
		} else {
			System.out.println("Insufficient balance. Minimum ₹500 must be maintained.");
		}
	}
}
class CurrentAccount61 extends BankAccount61 {
	CurrentAccount61(double balance) {
		super(balance);
	}
	void deposit(double amount) {
		balance += amount;
		System.out.println("Deposited ₹" + amount + " to Current Account.");
	}
	void withdraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
			System.out.println("Withdrew ₹" + amount + " from Current Account.");
		} else {
			System.out.println("Insufficient funds in Current Account.");
		} 
	}
}
public class Program234{
	public static void main(String[] args) {
		BankAccount61 savings = new SavingsAccount61(1000);
		System.out.println("=== Savings Account ===");
		savings.deposit(200);
		savings.withdraw(600);
		savings.withdraw(200);
		savings.displayBalance();
		System.out.println();
		BankAccount61 current = new CurrentAccount61(2000);
		System.out.println("=== Current Account ===");
		current.deposit(1000);
		current.withdraw(2500);
		current.withdraw(800);
		current.displayBalance();
	}
}