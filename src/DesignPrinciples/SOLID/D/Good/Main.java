package DesignPrinciples.SOLID.D.Good;

public class Main {
    public static void main(String[] args) {
        //Inject EmailSender
        IMessageSender emailSender = new EmailSender();
        NotificationService emailService = new NotificationService(emailSender);
        emailService.sendNotification("Hello via Email");

        //Inject SmsSender
        IMessageSender smsSender = new SMSSender();
        NotificationService smsService = new NotificationService(smsSender);
        smsService.sendNotification("Hello via SMS");
    }
}
