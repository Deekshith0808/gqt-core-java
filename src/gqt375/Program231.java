package gqt375;
/**
 * @author sai deekshith
 */
abstract class Payment {
	String payee;
	Payment(String payee) {
		this.payee = payee;
	}
	abstract void makePayment();
	void showPayee() {
		System.out.println("Payee: " + payee);
	}}
class CreditCardPayment extends Payment {
	CreditCardPayment(String payee) {
		super(payee);
	}
	@Override
	void makePayment() {
		System.out.println("Processing credit card payment for " + payee);
	}
}
class UPIPayment extends Payment {
	UPIPayment(String payee) {
		super(payee);
	}
	@Override
	void makePayment() {
		System.out.println("Processing UPI payment to " + payee);
	}}
public class Program231 {
	public static void main(String[] args) {
		Payment credit = new CreditCardPayment("Amazon");
		Payment upi = new UPIPayment("Flipkart");
		credit.showPayee();
		credit.makePayment();
		System.out.println();
		upi.showPayee();
		upi.makePayment();
	}
}