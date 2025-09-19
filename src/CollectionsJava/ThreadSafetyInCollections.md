# Thread Safety in context of Collections in Java

Java offers several ways to achieve thread safety in collections.<br>
Primarily through synchronized wrappers for standard collections and specialized concurrent collections in the java.util.concurrent package.

### 1. Synchronized Wrappers in java

The Collections utility class provides static methods to create synchronized (thread-safe) versions of standard collections like List, Set, and Map. 
These methods return a synchronized wrapper around the original collection, 
where every method call is synchronized on the collection object itself.

<code> // initializing an array list and then making it thread safe using the wrapper.

    - List<String> nonThreadSafeList = new ArrayList<>();  
    - List<String> threadSafeList = Collections.synchronizedList(nonThreadSafeList);

// Now, threadSafeList can be safely accessed by multiple threads.

</code>

### 1. Concurrent Collections (java.util.concurrent package)

This package provides highly optimized, thread-safe collections designed for concurrent environments, 
offering better performance and scalability than synchronized wrappers in many scenarios.

Few Collections present in this package : 
1. Concurrent HashMap
2. CopyOnWriteArrayList: A thread-safe variant of ArrayList where all mutative operations (add, set, remove) are implemented by making a fresh copy of the underlying array. 
This is efficient for read-heavy operations as reads don't require synchronization. 
3. CopyOnWriteArraySet: Similar to CopyOnWriteArrayList, providing a thread-safe Set implementation suitable for read-heavy scenarios.
4. ConcurrentLinkedQueue: A thread-safe, non-blocking queue that uses lock-free algorithms for high-throughput queuing. 
5. ConcurrentSkipListMap: A scalable concurrent NavigableMap implementation.
6. ConcurrentSkipListSet: A scalable concurrent NavigableSet implementation.
7. BlockingQueue implementations (e.g., ArrayBlockingQueue, LinkedBlockingQueue): These are thread-safe queues that support blocking operations, 
useful for producer-consumer patterns where threads might need to wait for elements to become available or for space in the queue.

