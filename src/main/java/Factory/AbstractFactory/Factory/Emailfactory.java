package Factory.AbstractFactory.Factory;

import Factory.Practicalfactory.EmailNotification;
import Factory.Practicalfactory.Notification;

public class Emailfactory implements NotificationFactory{
    @Override
    public Notification createNotification(String sender,String message) {
        return new EmailNotification(sender,message);
    }
}
