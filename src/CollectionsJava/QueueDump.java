package CollectionsJava;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

// We will use LinkedList for this refwerence and implement queues 
public class QueueDump {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        // Adding elements
        q.offer("KKG");
        q.offer("Gully Gang");
        q.offer("Kalamkaar");
        q.offer("Ferozi");
        q.offer("Death Row Records");
        q.offer("Shady Records");
        System.out.println(q);
        // Iterating queues 
        // Using for each
        for (String str : q) {
            System.out.println(str);
        }
        // Using Iterator
        Iterator<String> itr = q.iterator();
        while(itr.hasNext()){
            System.out.println("Iterating element: " + itr.next());
        }

        // Looking at what element is top that will exit first 
        System.out.println(q.peek()); // This does not remove the element 
        System.out.println(q);

        // Queue follows First In First Out approach - FIFO so the element that was enetred first will exit first.
        // In this case - KKG >> as also shown by the peek() function.@interface
        // removing element 
        q.poll(); // removes element 
        System.out.println(q.poll()); // if needed to see what element was removed. 
        System.out.println(q);

        // Adjacent to offer(), peek(), and poll() there are functoins like add(), element(), and remove(). 
        // These serve the same functon like the rest of them.  offer - add | peek - element | poll - remove
        // But in case if they are not able to operate or execute on a queue, they can throw an exception
        
        // clears the queue empties it
        q.clear();
        System.out.println(q);
    }
}
