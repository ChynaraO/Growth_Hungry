package JavaIntensive.W5_HW.PaymentSystem;

import java.util.Random;

public class PaymentProcessor {

    public static void processPayments(Payable[] payables){
            Random random = new Random();
            for(Payable p : payables){
                double  amount = 1 + random.nextInt(100); //random between 1-100
                p.pay(amount);
            }
    }
}
