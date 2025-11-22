package DesignPrinciples.SOLID.D.Good;

/*
+ The NotificationService depends on an interface
(abstraction).
You can easily "inject" any service (Email, SMS)
that implements the interface.
 */
public interface IMessageSender { //Abstraction
    void sendMessage(String message);
}
