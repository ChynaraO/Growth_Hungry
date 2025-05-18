package JavaIntensive.W5_HW.PaymentSystem;

public class Main {

    public static void main(String[] args) {
        Payable[] payables = new Payable[3];
        payables[0] = new CreditCardPayment("1234-567-8900-1234");
        payables[1] = new CashPayment();
        payables[2] = new CreditCardPayment("3333-3333-3333-3333");

        // Process payments using polymorphism
        PaymentProcessor.processPayments(payables);

        // Example refunds
        payables[0].refund(50.0);
        payables[1].refund(20.0);
    }
}
