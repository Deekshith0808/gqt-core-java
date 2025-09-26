package gqt375;
/**
 * @author sai deekshith
 */
abstract class BankAccount5 {
	protected double balance;
	public BankAccount5(double balance) {
		this.balance = balance;
	}
	abstract void deposit(double amount);
	abstract void withdraw(double amount);
}
class SavingsAccount3 extends BankAccount5 {
	public SavingsAccount3(double balance) {
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
class CurrentAccount3 extends BankAccount5 {
	private double overdraftLimit = 1000;
	public CurrentAccount3(double balance) {
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
public class Program222{
	public static void main(String[] args) {
		SavingsAccount3 savingsAccount = new SavingsAccount3(1000.0);
		CurrentAccount3 currentAccount = new CurrentAccount3(2000.0);
		savingsAccount.deposit(500.0);
		savingsAccount.withdraw(200.0);
		savingsAccount.withdraw(1500.0);
		currentAccount.deposit(1000.0);
		currentAccount.withdraw(2500.0);
		currentAccount.withdraw(500.0);
	}
}