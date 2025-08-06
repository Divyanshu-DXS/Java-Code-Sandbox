package Abstraction.Interface.NotifierSystem;

public class PushNotification implements Notifier{

    @Override
    public void notifyUser(String msg) {
        System.out.println("Notified User via ..."+msg);
    }
    
}
