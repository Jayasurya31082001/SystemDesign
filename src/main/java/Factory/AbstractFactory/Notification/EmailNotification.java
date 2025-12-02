package Factory.AbstractFactory.Notification;

import Factory.Practicalfactory.Notification;

public class EmailNotification extends Notification {
    public EmailNotification(String sender, String message) {
        super(sender, message);
    }

    @Override
    public void sendNotification() {
        System.out.println("Email sending to "+getSender()+ " message :"+getMessage());
    }

    @Override
    public void getNotificationType() {
        System.out.println(NotificationType.EMAIL);
    }
}
