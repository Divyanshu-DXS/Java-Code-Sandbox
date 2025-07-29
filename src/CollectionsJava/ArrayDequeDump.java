package CollectionsJava;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDequeDump {
    public static void main(String[] args) {

        ArrayDeque<Integer> adq = new ArrayDeque<>();
        // Array Deque is a double eneded linked list
        // This gives us options to access and operate on elements from the beginning of
        // the list and the end of the list
        // additionally have options to access first or last elements explicitly

        adq.offer(12);
        adq.offer(21);
        adq.offer(54);
        adq.offer(5);
        System.out.println(adq); // so far implemented as a regular queue
        System.out.println(adq.peek()); // should return 12 as First in First out
        adq.offer(16); // should be put at the end of the list after 5
        System.out.println(adq);
        // Now since Array Deque lets us access and operate on the first element as well
        // :
        adq.offerFirst(19); // should add this in the front of the list now
        System.out.println(adq);
        adq.offerLast(33); // should add to the last as ususal
        System.out.println(adq);
        // Similary we also have peek and poll optoins available for elements on first
        // and last indexes
        System.out.println("Peeking first element: " + adq.peekFirst());
        System.out.println("Peeking last element: " + adq.peekLast());
        // removing elements
        System.out.println("Array Deque Now : " + adq);
        System.out.print("Removed Last element : ");
        adq.pollLast();
        System.out.println(adq);
        System.out.print("Removing First Element :");
        adq.pollFirst();
        System.out.println(adq);

        // THOUGHT: If we kept inserting the elements and kept using pollLast() it would
        // kind of act like a Stack
        // Because then it would be working as a First in Last out or Last in First out
        // protocol as the Stacks

    }
}
