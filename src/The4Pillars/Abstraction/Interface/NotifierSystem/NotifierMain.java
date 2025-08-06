package Abstraction.Interface.NotifierSystem;

public class NotifierMain {
    public static void main(String[] args) {
        Notifier email = new EmailNotification();
        Notifier sms = new SMSNotification();
        Notifier pushNot = new PushNotification();

        email.notifyUser("EMAIL NOTIFICATION");
        sms.notifyUser("SMS NOTIFICATION");
        pushNot.notifyUser("PUSH NOTIFICATION");
    }
}
