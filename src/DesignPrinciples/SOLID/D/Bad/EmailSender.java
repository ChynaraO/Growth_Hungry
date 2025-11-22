package DesignPrinciples.SOLID.D.Bad;

/*
Dependency Inversion Principle
high-level modules should not depend on low-level
modules. Both should depend on abstraction (interfaces).

The high-level NotificationService directly depends on the low-level EmailSender.
To use SMS, you must change NotificationService.
 */

public class EmailSender { //low-level module
    void sendEmail(String message){}
}

class NotificationService{  //high-level module
    EmailSender emailSender = new EmailSender(); //Direct dependency

    void  setNotification(String message){
        emailSender.sendEmail(message);
    }
}
