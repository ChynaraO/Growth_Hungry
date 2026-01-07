package DesignPatterns.Structural.Adapter;
/*
Structural Patterns (How classes are combined)

These patterns show how to build larger structures
 from small objects while keeping everything efficient
 and flexible.
 */
//Allows incompatible classes to work together.

public class PaymentAdapter implements PaymentProcessor {
    private OldPaymentGateway gateway;

    PaymentAdapter ( OldPaymentGateway gateway){
        this.gateway = gateway;
    }
    public void pay(double amount){
        gateway.makePayment((int) (amount * 100));
    }
}
