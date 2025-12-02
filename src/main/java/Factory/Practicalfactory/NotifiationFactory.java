package Factory.Practicalfactory;

public class NotifiationFactory {
    public  static  Notification createNotification(NotificationType notificationType,String sender,String message){
        switch (notificationType){
            case SMS :return  new SMSNotification(sender,message);
            case EMAIL:return  new EmailNotification(sender,message);
            case WHATSAPP:return  new WhatsappNotification(sender,message);
            default: throw  new IllegalArgumentException("Invalid Notification type");
        }
    }
}
