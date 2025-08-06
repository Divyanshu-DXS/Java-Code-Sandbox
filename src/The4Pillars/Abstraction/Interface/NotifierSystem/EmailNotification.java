package Abstraction.Interface.NotifierSystem;

public class EmailNotification implements Notifier {
    public void notifyUser(String msg){
        System.out.println("Notified User via ..."+msg);
    }
}
