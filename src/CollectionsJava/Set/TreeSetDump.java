package CollectionsJava.Set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDump {
    public static void main(String[] args) {
        // TreeSet stores only unique values in sorted order
        // Think of it like a binary search tree 
        // Since implements Set - no duplicates 

        Set<Integer> ts = new TreeSet<>();
        ts.add(12);
        ts.add(2);
        ts.add(18);
        ts.add(139);
        ts.add(5);
        ts.add(12); // should be ignored since duplicate
        ts.add(183);
        ts.add(012); // also gets ignored
        // sout should print an ordered set 
        System.out.println(ts);
        // can reverse the sorting order like below 
        Set<Integer> ts2 = new TreeSet<>(Comparator.reverseOrder());
        ts2.add(12);
        ts2.add(2);
        ts2.add(18);
        ts2.add(139);
        ts2.add(5);
        ts2.add(12); // should be ignored since duplicate
        ts2.add(183);
        ts2.add(012);
        // sout now should print in reverse order 
        System.out.println(ts2);

        // rest most functions are same as hashset or LinkedHashSet
        ts2.clear();
    }
}
