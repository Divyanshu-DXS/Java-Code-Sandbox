package Multithreading.ExecutorsFramework;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceDemo {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        
        Future<Integer> future = executor.submit(()-> 42); // submit method that returns an object of Future type 
        /* submit() method is overloaded with these parameter options below 
         * Runnable
         * Callable
         * Runnable, result - the get method for this 'Future' object can return an object if needed when the task is completed. 
        */

        // Runnable : Does not return anything | Has a run method () 
        Runnable runnable = (()->{System.out.println("This is runnable");});
        Future<?> future2 = executor.submit(runnable);
        try {
            future2.get();
        } catch (Exception e) {} 
        // Callable : Returns a value / object | has a call() method | throws exception 
        Callable callable = (()-> 1001);
        Future<Integer> future3 = executor.submit(callable);
        try {
            System.out.println(future3.get());
        } catch (Exception e) {}
        // Runnable, result : Takes a runnable argument, along with a a result that will be returned 
        Runnable runnable2 = (()->{System.out.println("Inside Runnable 2 ....");});
        Future<String> future4 = executor.submit(runnable2,"\nRunnable 2 is Working");
        try{
            future4.get();
            System.out.println(future4.get());
        }catch(Exception e){}

        executor.shutdown();
        try {
            executor.awaitTermination(1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(executor.isTerminated());

    }
}
