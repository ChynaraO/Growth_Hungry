package JavaIntensive.W5_HW.PaymentSystem;


public class CreditCardPayment implements Payable {
    private String creditcardNumber;
    public CreditCardPayment(String cardNumber){
        this.creditcardNumber=cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Processing credit card payment of $" + amount + " for card: " + creditcardNumber);
    }

    @Override
    public void refund(double amount) {
        System.out.printf("Refunding $%.2f to credit card: %s", amount, creditcardNumber.substring(creditcardNumber.length()-4));
    }
}
