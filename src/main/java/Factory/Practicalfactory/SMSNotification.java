package Factory.Practicalfactory;

public class SMSNotification extends  Notification{
    public SMSNotification(String sender, String message) {
        super(sender, message);
    }

    @Override
    public void sendNotification() {
        System.out.println("SMS message sending to "+getSender()+ " message :"+getMessage());
    }

    @Override
    public void getNotificationType() {
        System.out.println(NotificationType.SMS);
    }
}
