package JavaIntensive.W5_HW.PaymentSystem;

public class CashPayment implements Payable {
    @Override
    public void pay(double amount) {
        System.out.println("Accepting cash payment of $" + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunding the $" + amount + " in cash");
    }
}
