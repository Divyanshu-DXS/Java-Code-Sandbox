package Multithreading.CompletableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CFDemo {
    public static void main(String [] args) throws InterruptedException, ExecutionException{
        System.out.println("Main thread Starts ... ");
        System.out.println("XXXXXXXXXXXXXXXXX");

        // runAsync - no return value
        // main thread does not stop unless get() is called
        runAsyncDemo();

        // supplyAsync - returning values from async tasks
        // main thread continues doing work
        // cf.get() eventually retrieves the result
        supplyAsyncDemo();

        // thenApply - chaining operations
        // each step transforms the previous output
        thenApplyDemo();

        // thenAccept() - no need to call get() 
        // event driven - Do something when the task finishes, without blocking.
        thenAcceptDemo();

        // thenCombine() - Two tasks in parallel → combined result.
        thenCombineDemo();

        // thenCompose() - Task B depends on A (nested async) 
        thenComposeDemo();

        // exceptionally() - How to catch errors in async pipeline.
        // This way Futures don’t crash the main thread
        // You can gracefully recover
        exceptionallyDemo();

        // allOf() - Doing a parllel speed run 
        // 3 tasks each take 1 second
        //Sequential execution would take 3 seconds
        // CompletableFuture finishes them in 1 second
        // Perfect real-time demonstration of parallelism
        allOfDemo();


    }

    static void sleep(long ms) {
        try { Thread.sleep(ms); } catch (Exception e) {}
    }

    // runAsync
    private static void runAsyncDemo() throws InterruptedException, ExecutionException {
        CompletableFuture<Void> cf =
                CompletableFuture.runAsync(() -> {
                    sleep(1000);
                    System.out.println("Background task executed");
                });

        System.out.println("Main continues without waiting...");
        cf.get(); // wait for completion
        System.out.println("Main ends");
    }

    // supplyAsync
    static void supplyAsyncDemo() throws InterruptedException, ExecutionException{
        CompletableFuture<String> cf =
                CompletableFuture.supplyAsync(() -> {
                    sleep(1500);
                    return "Hello from background!";
                });

        System.out.println("Doing other work...");
        System.out.println("Result: " + cf.get());
    }

    // thenApply
    static void thenApplyDemo() throws InterruptedException, ExecutionException{
        CompletableFuture<String> cf =
                CompletableFuture.supplyAsync(() -> "java")
                                 .thenApply(str -> str.toUpperCase()) // accepts function in lambda
                                 .thenApply(str -> "Hello, " + str);

        System.out.println("Final Result = " + cf.get());
    }

    // thenAccept
    static void thenAcceptDemo() throws InterruptedException{
        CompletableFuture.supplyAsync(() -> 42)
                         .thenAccept(result -> System.out.println("Got: " + result)); // accepts a consumer in lambda

        System.out.println("Main thread not blocked");
        Thread.sleep(1000); // give async enough time to print
    }

    // thenCombine
    static void thenCombineDemo() throws InterruptedException, ExecutionException{
        // CF1 supplies one object
        CompletableFuture<Integer> price = CompletableFuture.supplyAsync(() -> {
            sleep(1000);
            return 200;
        });
        // CF2 supplies second object
        CompletableFuture<Integer> tax = CompletableFuture.supplyAsync(() -> {
            sleep(1500);
            return 50;
        });
        // CF3 combining returned objects 
        CompletableFuture<Integer> total =
                price.thenCombine(tax, (p, t) -> p + t); // accepts bi-function in lambda

        System.out.println("Total = " + total.get());
    }

    // ----- thenCompose Block -----
    // thenCompose
    static void thenComposeDemo() throws InterruptedException, ExecutionException{
        CompletableFuture<String> cf =
            getUser()
                .thenCompose(user -> getAddress(user)); // accepts function in lambda

        System.out.println(cf.get());
    }

    static CompletableFuture<String> getUser() {
        return CompletableFuture.supplyAsync(() -> {
            sleep(1000);
            return "Divyanshu";
        });
    }

    static CompletableFuture<String> getAddress(String user) {
        return CompletableFuture.supplyAsync(() -> {
            sleep(1000);
            return user + " lives in Canada";
        });
    }
    // ----- thenCompose Block Ends -----

    // exceptionally
    static void exceptionallyDemo() throws InterruptedException, ExecutionException{
        CompletableFuture<Integer> cf =
                CompletableFuture.supplyAsync(() -> {
                    if (true) throw new RuntimeException("Boom!");
                    return 100;
                })
                .exceptionally(e -> {
                    System.out.println("Error: " + e.getMessage());
                    return -1;
                });

        System.out.println("Result = " + cf.get());
    } 

    // allOf() -  Parallel speed test ------
    
    static void allOfDemo(){
        long start = System.currentTimeMillis();

        CompletableFuture<Integer> f1 = CompletableFuture.supplyAsync(() -> slowTask(1));
        CompletableFuture<Integer> f2 = CompletableFuture.supplyAsync(() -> slowTask(2));
        CompletableFuture<Integer> f3 = CompletableFuture.supplyAsync(() -> slowTask(3));

        CompletableFuture.allOf(f1, f2, f3).join();

        long end = System.currentTimeMillis();

        System.out.println("Total time = " + (end - start) + "ms");
    }

    static int slowTask(int id) {
        sleep(1000);
        System.out.println("Task " + id + " done");
        return id;
    }

    // allOf() -  Parallel speed test ends ------

}