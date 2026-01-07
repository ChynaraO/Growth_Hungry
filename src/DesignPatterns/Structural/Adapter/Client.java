package DesignPatterns.Structural.Adapter;

public class Client {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentAdapter(new OldPaymentGateway());
        processor.pay(10.50);
    }
}
