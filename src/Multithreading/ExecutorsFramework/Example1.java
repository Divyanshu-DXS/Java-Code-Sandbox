package Multithreading.ExecutorsFramework;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Example1 {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Thread [] threads = new Thread[10];

        for(int i = 0 ; i <10 ; i++){
             int val = i;
             executorService.submit( ()->{
                long result = factorial(val);
                System.out.println(result);
            });            
        }
        executorService.shutdown();
        try {
            executorService.awaitTermination(20, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            
            e.printStackTrace();
        }
        System.out.println("Total Run time : " + (System.currentTimeMillis()-startTime));
        
    }

    public static long factorial(int num){
        try{Thread.sleep(1000);}
        catch(InterruptedException e){}
        long result =1;
        for(int i =1 ; i <= num ; i++){
            result*=i;
        }
        return result;
    }
}
