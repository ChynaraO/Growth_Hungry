package DesignPrinciples.SOLID.D.Good;

//High-level module
public class NotificationService {
    private IMessageSender sender;
    //This tells Java that the variable sender can hold any object
    // that implements the IMessageSender interface.


    //The dependency is "injected" via the constructor
    NotificationService(IMessageSender sender){
        this.sender = sender;
    }
    void sendNotification(String message){
        sender.sendMessage(message); //Doesn't know or care if it's email or SMS
    }
}
