package DesignPrinciples.SOLID.D.Good;

//Another low-level module
public class SMSSender implements IMessageSender{

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
