package gqt375;
/**
 * @author sai deekshith
 */
abstract class BankAccount3 {
	protected double balance;
	public BankAccount3(double balance) {
		this.balance = balance;
	}
	abstract void deposit(double amount);
	abstract void withdraw(double amount);
}
class SavingsAccount1 extends BankAccount3 {
	public SavingsAccount1(double balance) {
		super(balance);
	}
	@Override
	public void deposit(double amount) {
		balance += amount;
		System.out.println("Deposited " + amount + " in Savings Account. New Balance: " + balance);
	}
	@Override
	public void withdraw(double amount) {
		if (balance - amount >= 500) {
			balance -= amount;
			System.out.println("Withdrawn " + amount + " from Savings Account. New Balance: " + balance);
		} else {
			System.out.println("Insufficient balance in Savings Account.");
		}
	}
}
class CurrentAccount1 extends BankAccount3 {
	private double overdraftLimit = 1000;
	public CurrentAccount1(double balance) {
		super(balance);
	}
	@Override
	public void deposit(double amount) {
		balance += amount;
		System.out.println("Deposited " + amount + " in Current Account. New Balance: " + balance);
	}
	@Override
	public void withdraw(double amount) {
		if (balance + overdraftLimit >= amount) {
			balance -= amount;
			System.out.println("Withdrawn " + amount + " from Current Account. New Balance: " + balance);
		} else {
			System.out.println("Overdraft limit reached in Current Account.");
		}
	}
}
public class Program211 {
	public static void main(String[] args) {
		SavingsAccount savingsAccount = new SavingsAccount(1000.0);
		CurrentAccount currentAccount = new CurrentAccount(2000.0);
		savingsAccount.deposit(500.0);
		savingsAccount.withdraw(200.0);
		savingsAccount.withdraw(1500.0);
		currentAccount.deposit(1000.0);
		currentAccount.withdraw(2500.0);
		currentAccount.withdraw(500.0);
	}
}