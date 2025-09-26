package gqt375;
/**
 * @author sai deekshith
 */
class BankAccount {
	private String accountNumber;
	private double balance;
	public BankAccount(String accountNumber, double initialBalance) {
		this.accountNumber = accountNumber;
		this.balance = initialBalance;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
		} else {
			System.out.println("Deposit amount must be positive.");
		}
	}
	public void withdraw(double amount) {
		if (amount > 0 && balance >= amount) {
			balance -= amount;
		} else {
			System.out.println("Invalid withdrawal amount or insufficient balance.");
		}
	}
}
public class Program153 {
	public static void main(String[] args) {
		BankAccount account = new BankAccount("123456789", 1000.0);
		System.out.println("Account Number: " + account.getAccountNumber());
		System.out.println("Initial Balance: $" + account.getBalance());
		account.deposit(500);
		System.out.println("Balance after deposit: $" + account.getBalance());
		account.withdraw(300);
		System.out.println("Balance after withdrawal: $" + account.getBalance());
		account.withdraw(2000);
	}
}