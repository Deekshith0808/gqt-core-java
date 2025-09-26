package gqt375;
/**
 * @author sai deekshith
 */
abstract class Bank1 {
	String bankName;
	Bank1(String name) {
		this.bankName = name;
	}
	abstract double getInterestRate();
	void displayBankName() {
		System.out.println("Bank Name: " + bankName);
	}
}
class SBI extends Bank1 {
	SBI() {
		super("State Bank of India");
	}
	@Override
	double getInterestRate() {
		return 6.5;
	}
}
class HDFC extends Bank1 {
	HDFC() {
		super("HDFC Bank");
	}
	@Override
	double getInterestRate() {
		return 7.2;
	}
}
public class Program223 {
	public static void main(String[] args) {
		Bank1 sbi = new SBI();
		Bank1 hdfc = new HDFC();
		sbi.displayBankName();
		System.out.println("Interest Rate: " + sbi.getInterestRate() + "%");
		System.out.println();
		hdfc.displayBankName();
		System.out.println("Interest Rate: " + hdfc.getInterestRate() + "%");
	}
}