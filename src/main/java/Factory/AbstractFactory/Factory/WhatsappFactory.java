package Factory.AbstractFactory.Factory;

import Factory.Practicalfactory.Notification;
import Factory.Practicalfactory.WhatsappNotification;

public class WhatsappFactory implements NotificationFactory{
    @Override
    public Notification createNotification(String sender, String message) {
        return new WhatsappNotification(sender,message);
    }
}
