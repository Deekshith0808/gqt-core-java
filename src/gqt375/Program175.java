package gqt375;
/**
 * @
 * 
 */

class BankAccount1 {
	private int accountNumber;
	private double balance;
	public BankAccount1(int accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposited: " + amount);
		} else {
			System.out.println("Deposit amount must be positive.");
		}
	}
	public void withdraw(double amount) {
		if (amount > 0 && balance >= amount) {
			balance -= amount;
			System.out.println("Withdrawn: " + amount);
		} else {
			System.out.println("Invalid withdrawal amount or insufficient funds.");
		}
	}
}
public class Program175 {
	public static void main(String[] args) {
		BankAccount1 account = new BankAccount1(12345, 1000.0);
		System.out.println("Account Number: " + account.getAccountNumber());
		System.out.println("Balance: " + account.getBalance());
		account.deposit(500.0);
		System.out.println("New Balance: " + account.getBalance());
		account.withdraw(200.0);
		System.out.println("New Balance: " + account.getBalance());
	}
}