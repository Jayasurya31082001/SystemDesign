package Factory.AbstractFactory;

import Factory.AbstractFactory.Factory.Emailfactory;
import Factory.AbstractFactory.Factory.NotificationFactory;
import Factory.Practicalfactory.Notification;

public class Client {
    public static void main(String[] args) {
        String sender = "Anamika";
        String message = "Hii";
        NotificationFactory factory = new Emailfactory();
        Notification notification = factory.createNotification(sender,message);
        notification.sendNotification();
        notification.getNotificationType();
    }


}
