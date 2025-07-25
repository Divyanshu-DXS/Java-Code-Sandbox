package CollectionsJava;

import java.util.Stack;

public class StacksDump {
    public static void main(String[] args) {
        Stack <String> stk = new Stack<>();
        // adding elements 
        stk.push("Krsna");
        stk.push("Karma");
        stk.push("Divine");
        stk.push("Dino James");
        
        System.out.println(stk);

        // peeking element on top that will exit first. 
        System.out.println(stk.peek());
        // this will not be removed it just peeks 
        System.out.println(stk);

        // To remove an element we can instead use, pop that will take out the top element
        // Stack follows Last In First Out approach -- LIFO so the element enetered last will be removed first 
        // removing 
        System.out.println(stk.pop()); // this removes and also returns what element has been removed. 
        // Remove an element from a certain index
        stk.remove(1);

        System.out.println(stk);
        stk.add(0,"Dino James");
        System.out.println(stk);
    }
}
