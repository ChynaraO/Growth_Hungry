package DesignPrinciples.SOLID.D.Good;

public class EmailSender implements IMessageSender{ //Low-level module

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending EMAIL: " + message);
    }
}
