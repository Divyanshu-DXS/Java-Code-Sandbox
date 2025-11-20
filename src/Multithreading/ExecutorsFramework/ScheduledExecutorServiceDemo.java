package Multithreading.ExecutorsFramework;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceDemo {
    public static void main(String[] args) {
        ScheduledThreadPoolExecutor scheduler = new ScheduledThreadPoolExecutor(3);
        scheduler.schedule(()->{System.out.println("Hey");}, 2, TimeUnit.SECONDS);
        
        scheduler.scheduleAtFixedRate(()->{System.out.println("Fixed rate !");}, 3, 3, TimeUnit.SECONDS);

        scheduler.scheduleWithFixedDelay(()->{System.out.println("With Fixed Delay");}, 3, 1, TimeUnit.SECONDS);
        
        scheduler.schedule(()->{
            System.out.println("Initiating Shutdown .... ");
            scheduler.shutdown();}, 
            5, TimeUnit.SECONDS);
        
    }
}
