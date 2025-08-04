package CollectionsJava.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
         Problem: Unique City Names from Travel Logs
        Imagine you have a list of cities visited by a traveler, with some duplicates.
        String[] travelLog = {"Paris", "Tokyo", "Delhi", "New York", "Paris", "Tokyo", "Berlin", "Amsterdam", "Zurich", "Delhi"};
        Your Task:
        Print all unique cities with:
        1. (no order)
        2. (preserve visit order)
        3. (alphabetically sorted)
 */
        
public class MiniChallengeCode {
    public static void main(String[] args) {
        
        String[] travelLog = {
            "Paris", "Tokyo", "Delhi", "New York", "Paris", "Tokyo", "Berlin", "Amsterdam", "Zurich", "Delhi"
        };

        // HashSet
        Set<String> hashSet = new HashSet<>();
        // LinkedHashSet
        Set<String> linkedHashSet = new LinkedHashSet<>();
        // TreeSet
        Set<String> treeSet = new TreeSet<>();

        for (String city : travelLog) {
            hashSet.add(city);
            linkedHashSet.add(city);
            treeSet.add(city);
        }

        System.out.println("HashSet (no order): " + hashSet);
        System.out.println("LinkedHashSet (insertion order): " + linkedHashSet);
        System.out.println("TreeSet (sorted): " + treeSet);
    }
}
