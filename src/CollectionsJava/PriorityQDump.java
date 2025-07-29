package CollectionsJava;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

// When we want to implement a queue but also want to give priority to elements 
// 
public class PriorityQDump {
    public static void main(String[] args) {

        // By default a Priority Queue implements minHeap algorithm, that means that the
        // smallest element wuold always be on the top.
        // Lets see this in action
        // Priority queue since it implements queue on the back end. it uses the same
        // functons as queues

        // Declaring a priority queue object
        Queue<Integer> pq = new PriorityQueue<>();
        System.out.println("QUEUE - PROIRITY-QUEUE");
        // Adding elements to the queue
        pq.offer(12);
        pq.offer(2);
        pq.offer(123);
        pq.offer(19);
        pq.offer(40);

        System.out.println(pq);
        System.out.println(pq.peek()); // should diplay the shortest element in the queue as that would the first one
                                       // to be removed
        // remove the element in order destined for the prioirty queue
        pq.poll(); // shiuold be the shortest
        System.out.println(pq); // printing and checking remaining elements and their order

        System.out.println();
        System.out.println(
                "Lets run the same sample of elements in an ordinary queue implementing LinkedList and observe the difference.");
        System.out.println("QUEUE - LINKED-LIST");
        Queue<Integer> llq = new LinkedList<>();
        llq.offer(12);
        llq.offer(2);
        llq.offer(123);
        llq.offer(19);
        llq.offer(40);
        // Printing the Linked List
        System.out.println(llq); // First In First out -- order preserved as insertion
        System.out.println(llq.peek()); // peeking the element in order to be removed
        llq.poll(); // removing an element
        System.out.println(llq); // printing and comparing to priority queues output

        System.out.println();
        System.out.println(
                "Now in case we wanted to save a priority queue but wanted a reverse order..... This is how we do it");
        System.out.println("QUEUE - PRIORITY-QUEUE(REVERSED)");
        Queue<Integer> pqr = new PriorityQueue<>(Comparator.reverseOrder()); // Use Comparator.reverseOrder()
        System.out.println("QUEUE - PROIRITY-QUEUE");
        // Adding elements to the queue
        pqr.offer(12);
        pqr.offer(2);
        pqr.offer(123);
        pqr.offer(19);
        pqr.offer(40);

        System.out.println(pqr);
        System.out.println(pqr.peek()); // should diplay the largest element in the queue as that would the first one
                                        // to be removed
        // remove the element in order destined for the prioirty queue
        pqr.poll(); // shiuold be the largest
        System.out.println(pqr); // printing and checking remaining elements and their order

        // Other than that Priority queues uses similar functions as queues
        // It is the implementation that runs behind it to store them based on set
        // priority is what makes them different
        // IMPORTANT DS

    }
}
