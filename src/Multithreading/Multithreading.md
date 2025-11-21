# Multithreading - A deep dive

### Core concepts and foundation leading to comprehensive understanding of the concept: 
- CPU   : Central Processing Unit (The Brain)
- Core  : A core is an individual processing unit within a CPU. Now we have multiple cores in OS. A quad-core processor has four cores, allowing it to perform four tasks simultaneously. For instance, one core could handle your web browser, another your music player, another a download manager, and another a background system update.
- Program   : A program is a set of instructions written in a programming language that tells the computer how to perform a specific task
- Process   : An instance of a program that is being executed. When a program runs, the operating system creates a process to manage its execution.
- Thread    : The smallest unit of execution within a process. A process can have multiple threads, which share the same resources but can run independently. A web browser like Google Chrome might use multiple threads for different tabs, with each tab running as a separate thread.
- Multitasking  : Multitasking allows an operating system to run multiple processes simultaneously. 
  - On single-core CPUs, this is done through time-sharing, rapidly switching between tasks.
  - On multi-core CPUs, true parallel execution occurs, with tasks distributed across cores. 
  - The OS scheduler balances the load, ensuring efficient and responsive system performance. <br>
<code>
Example: We are browsing the internet while listening to music and downloading a file.
</code>

- Multithreading    : Refers to the ability to execute multiple threads within a single process concurrently. A web browser can use multithreading by having separate threads for rendering the page, running JavaScript, and managing user inputs. This makes the browser more responsive and efficient.
  - enhances the efficiency of multitasking by breaking down individual tasks into smaller sub-tasks or threads. These threads can be processed simultaneously, making better use of the CPU’s capabilities.

#### In a single-core system:
Both threads and processes are managed by the OS scheduler through time slicing and context switching to create the illusion of simultaneous execution.

#### In a multi-core system:
Both threads and processes can run in true parallel on different cores, with the OS scheduler distributing tasks across the cores to optimize performance.

- Time Slicing  : It divides CPU time into small intervals called time slices or quanta.
  - Function: The OS scheduler allocates these time slices to different processes and threads, ensuring each gets a fair share of CPU time.
  - Purpose: This prevents any single process or thread from monopolizing the CPU, improving responsiveness and enabling concurrent execution.

- Context Switching : It is the process of saving the state of a currently running process or thread and loading the state of the next one to be executed.
  - Function: When a process or thread’s time slice expires, the OS scheduler performs a context switch to move the CPU’s focus to another process or thread.
  - Purpose: This allows multiple processes and threads to share the CPU, giving the appearance of simultaneous execution on a single-core CPU or improving parallelism on multi-core CPUs.


## Multithreading in Java

Java provides robust support for multithreading, allowing developers to create applications that can perform multiple tasks simultaneously, improving performance and responsiveness.


Java’s multithreading capabilities are part of the java.lang package, making it easy to implement concurrent execution.

- In a single-core environment, Java’s multithreading is managed by the JVM and the OS, which switch between threads to give the illusion of concurrency.

- In a multi-core environment, Java’s multithreading can take full advantage of the available cores. The JVM can distribute threads across multiple cores, allowing true parallel execution of threads.

### Java supports multithreading through its java.lang.Thread class and the java.lang.Runnable interface.

<code><b>When a Java program starts, one thread begins running immediately, which is called the main thread. This thread is responsible for executing the main method of a program.</b></code>

- To create a new thread in Java, you can 
  - either extend the Thread class or 
  - implement the Runnable interface.

### Thread Lifecycle

- New   : A thread is in this state when it is created but not yet started.
- Runnable  : After the start method is called, the thread becomes runnable. It’s ready to run and is waiting for CPU time.
- Running   : The thread is in this state when it is executing.
- Blocked/Waiting   : A thread is in this state when it is waiting for a resource or for another thread to perform an action.
- Terminated    : A thread is in this state when it has finished executing.

### Thread Priorities 

Java assigns priority to its threads, that can decide or conclude the running order when compared to other threads. These priorities are set in integer values. This can decide the running order and when execution needs to be switched from one thread to another .... this is called <U>CONTEXT SWITCHING.</U>

### Thread Methods
- start( ): Begins the execution of the thread. The Java Virtual Machine (JVM) calls the run() method of the thread.
- run( ): The entry point for the thread. When the thread is started, the run() method is invoked. If the thread was created using a class that implements Runnable, the run() method will execute the run() method of that Runnable object.
- sleep(long milliseconds): Causes the currently executing thread to sleep (temporarily cease execution) for the specified number of milliseconds.
- join( ): Waits for this thread to die. When one thread calls the join() method of another thread, it pauses the execution of the current thread until the thread being joined has completed its execution.
- setPriority(int newPriority): Changes the priority of the thread. The priority is a value between Thread.MIN_PRIORITY (1) and Thread.MAX_PRIORITY (10).
- interrupt(): Interrupts the thread. If the thread is blocked in a call to wait(), sleep(), or join(), it will throw an InterruptedException.
- yield(): Thread.yield() is a static method that suggests the current thread temporarily pause its execution to allow other threads of the same or higher priority to execute. It’s important to note that yield() is just a hint to the thread scheduler, and the actual behavior may vary depending on the JVM and OS.
- Thread.setDaemon(boolean): Marks the thread as either a daemon thread or a user thread. When the JVM exits, all daemon threads are terminated.

### Synchronization 

Synchronization is also important. in many cases if multiple threads are accessing and shared resource at the same time, if the value of the respource is being modified, it can cuase concurrent issues and the value returned would not be consisted with the expectatoins. Since multiple threads will be modifying the same resource multiple times on thier end. 
In that case we can always wrap that method with a synchronization keyword that can make sure that whenever that method is being accessed by a thread, it only allows one thread at a time to execute it.. this can help maintain the concurrency and does not lead to discrepancy.
But.... this can also lead us into a challenege where if a single resource takes a lot of time, and respurces the other threads are held back from theier executoins, that can weigh heavy on the applicatoins performacnce and resourcefullness. 

### Locks

A lock is a mechanism that allows only one thread at a time to access a shared resource (like a variable or object). In Java, every object has a built-in intrinsic lock, used automatically when you use the synchronized keyword.

### Reentrant Lock

Java also provides the ReentrantLock class for manual control over locking.
ReentrantLock gives you more power than synchronized, including:
- Try-locking (tryLock()),
- Fairness control,
- Checking if the lock is held,
- Interruptible locking.

### ReadWrite Lock

Some operations only read shared data and don’t modify it.
Multiple threads can safely read simultaneously — but if one thread wants to write, it must be exclusive.
- Many threads can call read() at the same time.
- Only one thread can call write() at a time — and it blocks all readers too.
- Great for performance when reads are frequent and writes are rare.

### Fairness of the locks 

When multiple threads are waiting for a lock, the JVM can choose which one gets it next.
By default, locks are unfair — meaning the most recently waiting thread might get the lock first (better performance but less predictable).
You can make a lock fair by passing true to the constructor.

### DeadLock

A deadlock occurs when two or more threads are waiting for each other’s locks, so none can proceed.
How to avoid deadlocks:

- Always acquire locks in the same order.
- Try using tryLock() with a timeout.
- Keep lock-holding code blocks short.

A deadlock usually occurs when these 4 conditions are met simultaneously: 
- When any one thread has acquired and holding a resource and is waiting to acquire another resource that is held by another thread
- when only one thread can access/acquire a resource at a time 
- Resources can not be forcibly taken 
- A set of threads is waiting for each other in a circular chain. 

### Thread Communication 

- wait()
- notify()
- notifyAll()

### Thread Pool 

Collection of threads pre initialized threads that are ready to perform a task 

It helps with : 
- Resource Management 
- Control over thread creation and management 
- Response Time 


### Executor Framework 

This was introduced to simplify the development of concurrent applications by abstracting away many of the complexity of creating and managing threads 

#### Why Executor Framework Exists

------------ 
Before Executors, developers created threads like this:
 - - new Thread(() -> { /* work */ }).start();

Problems with this old approach:

- manual thread management 
- scalability 
- Unbounded thread creation → memory crash
- No control over scheduling
- No monitoring
- No lifecycle management - thread recycling / resource management
- Hard to cancel/timeout tasks
- error handling 
------------ 

Executors solve all of this.
They give you:

- A thread pool (reusable threads)
- A task queue
- Control over lifecycle
- Support for returning values (Callable/Future)
- Scheduling tasks

There are 3 core interfaces in this framework 
- Executor
- ExecutorService 
  - newFixedThreadPool()
  - NewCachedThreadPool()
- ScheduledExecutorService 
  - newScheduledThreadPoolExecutor()

### Future

Future is an interface in Java used to represent the result of an asynchronous computation.
When you submit a task to an ExecutorService, it immediately returns a Future object, which acts like a placeholder for the value that will be computed in the background.
It allows you to check if the task is complete, retrieve the result, cancel the task, or check for exceptions.


#### Executor Service // some common methods
- .submit(Runnable)
- .submit(Callable)
- .submit(Runnable, result)
- .shutdown()
- .shutdownNow()
- .isShutDown()
- .awaitTermination()
- .isTerminated()
- .invokeAll()

ExecutorService's Submit has been overloaded with 3 different types of parameters 
- Callable - returns any value 
- Runnable - does not return anything
- Runnable, result - the get method for this 'Future' object can return an object if needed when the task is completed. 

### Java Count Down Latch
### Cyclic Barrier

### Completable Future 

Completable future was introduced in java 8 to handle Asynchronous programming. 
Multi threading is used to achieve asynchronous programming. 

Earlier we used to work with threads, Future, ExecutorService. 
And it had few problem statements that needed to be solved. 
- Future result had to be polled 
- Future could not be cancelled or completed manually 
- Chaining was not possible
- Error handling was weak
- Callback was difficult 

Completable Future was then introduced in java 8 to help us solve these

>> Think like this, You have given someone a task to complete. 
And you have asked them to complete that task and get the result. 
Once the result has been received, then you want them to automatically start the next task, and in case if there is an error while accomplishing the task, you want to initiate a backup plan then. .... This is exactly the kind of situation Completable future helps you with. 

- runAsync() -> Does not return any value 
>> CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
    System.out.println("Background task running...");
});

- supplyAsync() -> Returns a value
>> CompletableFuture<String> future =
    CompletableFuture.supplyAsync(() -> "Data from server");


Chaining can be done by .. 
- thenApply : this helps us modify the result
>> CompletableFuture<String> processed =
    CompletableFuture.supplyAsync(() -> "Data")
                     .thenApply(data -> data + " processed");

- then accept : Consumes the result
>> .thenAccept(result -> System.out.println("Result: " + result));

- thenRun : the result in this case is not that important, instead it wants the function to do something once the result is received.
>> .thenRun(() -> System.out.println("Done!")); 

Combine multiple Async tasks : CompletableFuture.allOf(f1,f2); 
>> CompletableFuture<Integer> f1 = CompletableFuture.supplyAsync(() -> 10);
CompletableFuture<Integer> f2 = CompletableFuture.supplyAsync(() -> 20);
CompletableFuture<Void> all = CompletableFuture.allOf(f1, f2);
all.join();  // Wait until f1 and f2 both finish
int sum = f1.join() + f2.join();

Similarly there is : CompletableFuture.anyOf(f1,f2);
>> CompletableFuture.anyOf(f1, f2)
    .thenAccept(result -> System.out.println("Fastest: " + result));


Error Handling : can use .exceptionally in chaining to give a back up value 
>> CompletableFuture.supplyAsync(() -> {
    if (true) throw new RuntimeException("Error!");
    return "OK";
}).exceptionally(ex -> "Backup value");

<u>By default thread pool used is ForkJoinPool.commonPool. But if needed a custom pool can also be provided ....  </u>
>> ExecutorService executor = Executors.newFixedThreadPool(5);
CompletableFuture.supplyAsync(() -> task(), executor);
