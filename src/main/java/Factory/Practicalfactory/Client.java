package Factory.Practicalfactory;

import static Factory.Practicalfactory.NotifiationFactory.createNotification;
import static Factory.Practicalfactory.NotificationType.*;

public class Client {
    public static void main(String[] args) {
        String sender = "Hari";
        String  message = "Hello";
        Notification notification = createNotification(SMS,sender,message);
        notification.sendNotification();

    }
}
