package gqt375;
/**
 * @author sai deekshith
 */
class BankAccounts {
	private String accountNumber;
	private double balance;
	public BankAccounts(String accountNumber, double initialBalance) {
		this.accountNumber = accountNumber;
		this.balance = initialBalance;
	}
	public double getBalance() {
		return balance;
	}
	public void deposit(double amount) {
		balance += amount;
	}
	public void withdraw(double amount) {
		balance -= amount;
	}
}
public class Program154 {
	public static void main(String[] args) {
		BankAccounts account = new BankAccounts("12345", 1000.0);
		System.out.println("Initial Balance: " + account.getBalance());
		account.deposit(500.0);
		System.out.println("Balance after deposit: " + account.getBalance());
		account.withdraw(200.0);
		System.out.println("Balance after withdrawal: " + account.getBalance());
	}
}