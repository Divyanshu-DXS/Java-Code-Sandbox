package Multithreading;

public class WorldImplementingThreads implements Runnable{

    @Override
    public void run() {
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Thread from class implementing interface is now : RUNNING....");// RUNNING
    }
    
}