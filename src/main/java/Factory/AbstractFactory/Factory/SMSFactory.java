package Factory.AbstractFactory.Factory;

import Factory.Practicalfactory.Notification;
import Factory.Practicalfactory.SMSNotification;

public class SMSFactory implements NotificationFactory{
    @Override
    public Notification createNotification(String sender, String message) {
        return new SMSNotification(sender,message);
    }
}
