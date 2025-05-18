package JavaIntensive.W5_HW.PaymentSystem;

public interface Payable {
    void pay(double amount);
    void refund(double amount);
}
