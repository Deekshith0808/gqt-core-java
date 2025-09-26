package gqt375;
/**
 * @author sai deekshith
 */
class Program167 {
	private int accountNumber;
	private double balance;
	public Program167(int accountNumber, double balance) {
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
			System.out.println("Withdrawal: " + amount);
		} else {
			System.out.println("Invalid withdrawal amount or insufficient funds.");
		}
	}
	public static void main(String[] args) {
		Program167 account = new Program167(123456, 1000.0);
		System.out.println("Account Number: " + account.getAccountNumber());
		System.out.println("Initial Balance: " + account.getBalance());
		account.deposit(500.0);
		System.out.println("Balance after deposit: " + account.getBalance());
		account.withdraw(300.0);
		System.out.println("Balance after withdrawal: " + account.getBalance());
		account.withdraw(2000.0);
	}
}