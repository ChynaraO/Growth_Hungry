package DesignPatterns.Structural.Adapter;
//incompatible class-adaptee
public class OldPaymentGateway {
    void makePayment(int cents){
        System.out.println("Paid " + cents + " cents");
    }
}
