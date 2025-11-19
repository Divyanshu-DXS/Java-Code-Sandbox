package Multithreading.ExecutorsFramework;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
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
        
        // Experimenting with invokeAll()

        Callable<Integer> call1 = (()->{
            System.out.println("Callable object 1");
            return 1;});
        Callable<Integer> call2 = (()->{
            System.out.println("Callable object 2");
            return 2;});
        Callable<Integer> call3 = (()->{
            System.out.println("Callable object 3");
            return 3;});
        Callable<Integer> call4 = (()->{
            System.out.println("Callable object 4");
            return 4;});
        Callable<Integer> call5 = (()->{
            System.out.println("Callable object 5");
            return 5;});

        List<Callable<Integer>> list = Arrays.asList(call1,call2,call3,call4,call5);
        List<Future<Integer>> futures = null;
        try {
            futures = executor.invokeAll(list);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for(Future<Integer> fut : futures){
            try {
                System.out.println(fut.get());
            } catch (Exception e) {
            }
        }

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
