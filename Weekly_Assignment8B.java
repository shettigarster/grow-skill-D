package assignments;

//Design a Java program for an E-commerce Payment System using an abstract class.

abstract class Payment{
	protected double amount;
	
	public Payment (double amount) {
		this.amount=amount;
	}
	
	abstract void makePayment ();
	
	void paymentDetails()
	{
		System.out.println("Payment amount :" + amount);
	}
}

class CreditCardPayment extends Payment {
	private String cardNumber;
	
	public CreditCardPayment (double amount, String cardNumber) {
		super(amount);
		
		this.cardNumber =cardNumber;
	}
	
	@Override
	void makePayment() {
		String last4 = cardNumber.substring(cardNumber.length()-4);
		System.out.println("Paid"+ " "+ amount  + " Using credit card ending with " +last4);
	}
}

class UpiPayment extends Payment{
	private String UpiId;
	
	public UpiPayment(double amount ,String UpiId) {
		super(amount);
		this.UpiId =UpiId;
	}
	
	@Override
	
	void makePayment() {
		System.out.println("Paid "+ amount + " "+ "using UPI ID:"+ UpiId);
	}
	
	
}


public class Weekly_Assignment8B {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Payment Payment1 =new CreditCardPayment(5000, "14526352653655655");
		Payment1.paymentDetails();
		Payment1.makePayment();
		
		System.out.println();
		
		Payment payment2 =new UpiPayment(1500,"user@upi");
		payment2.paymentDetails();
		payment2.makePayment();
		
		

		
		
		
		
	}

}
