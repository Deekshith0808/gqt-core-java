package gqt375;
/**
 * @author sai deekshith
 */
class BankAccount62 {
	String accountNumber;
	double balance;
	BankAccount62(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	void displayAccountInfo() {
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Balance: ₹" + balance);
	}
}
class SavingAccount62 extends BankAccount62 {
	double interestRate = 4.0;
	SavingAccount62(String accountNumber, double balance) {
		super(accountNumber, balance);
	}
	void displaySavingInfo() {
		displayAccountInfo();
		System.out.println("Account Type: Saving");
		System.out.println("Interest Rate: " + interestRate + "%");
	}
}
class CurrentAccount62 extends BankAccount62 {
	double overdraftLimit = 10000.0;
	CurrentAccount62(String accountNumber, double balance) {
		super(accountNumber, balance);
	}
	void displayCurrentInfo() {
		displayAccountInfo();
		System.out.println("Account Type: Current");
		System.out.println("Overdraft Limit: ₹" + overdraftLimit);
	}
}
public class Program248 {
	public static void main(String[] args) {
		SavingAccount62 saving = new SavingAccount62("SA12345", 15000.0);
		System.out.println("=== Saving Account ===");
		saving.displaySavingInfo();
		System.out.println();
		CurrentAccount62 current = new CurrentAccount62("CA54321", 30000.0);
		System.out.println("=== Current Account ===");
		current.displayCurrentInfo();
	}
}
