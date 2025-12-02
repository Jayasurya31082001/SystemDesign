package Factory.AbstractFactory.Notification;

import Factory.Practicalfactory.Notification;

public class WhatsappNotification extends Notification {
    public WhatsappNotification(String sender, String message) {
        super(sender, message);
    }

    @Override
    public void sendNotification() {
        System.out.println("whatsapp message sending to "+getSender()+ " message :"+getMessage());
    }

    @Override
    public void getNotificationType() {
        System.out.println(NotificationType.WHATSAPP);
    }
}
