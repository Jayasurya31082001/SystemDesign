package Factory.AbstractFactory.Factory;

import Factory.Practicalfactory.Notification;

public interface  NotificationFactory {
    public  Notification createNotification(String sender,String  message);
}
