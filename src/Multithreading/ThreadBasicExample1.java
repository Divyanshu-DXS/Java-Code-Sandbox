package Multithreading;

// Method 1 - of creating threads
public class ThreadBasicExample1 {
    public static void main(String[] args) throws InterruptedException {
        World world = new World();
        world.start();
        for(int i =0; i<5;i++){
            System.out.println("Hello ");
        }

        WorldImplementingThreads world2 = new WorldImplementingThreads();
        Thread t1 = new Thread(world2);
        System.out.println(t1.getState()); // NEW
        t1.start();
        System.out.println(t1.getState()); // RUNNABLE
        Thread.sleep(100);
        System.out.println(t1.getState()); // TIMED_WAITING
        t1.join();
        System.out.println(t1.getState()); // TERMINATED
    }
}
