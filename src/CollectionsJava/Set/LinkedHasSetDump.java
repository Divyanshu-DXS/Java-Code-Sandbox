package CollectionsJava.Set;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LinkedHasSetDump {
    public static void main(String[] args) {
        // Linked HashSet -- maintains insertion order unlike hashsets 
        // Also does not allow or ignores duplicates  

        Set<Integer> lhs = new LinkedHashSet<>();
        lhs.add(12);
        lhs.add(1);
        lhs.add(13);
        lhs.add(10);
        System.out.println(lhs); // this should remember the insertion order unlike hashset
        // mostly implements all same operations and functions as hashset 


        Set<String> linkedSet = new LinkedHashSet<>();
        linkedSet.add("Apple");
        linkedSet.add("Banana");
        linkedSet.add("Mango");
        linkedSet.add("Tomatoes");
        linkedSet.add("apple"); // should not ignore since case sensitive
        linkedSet.add("Apple"); // should be ignored 
        System.out.println(linkedSet);

        // size
        System.out.println(linkedSet.size()); 
        // contains
        System.out.println(linkedSet.contains("Pineapple"));
        // is empty ? 
        System.out.println("Is this linked set empty: "+linkedSet.isEmpty());
        // contains all ?
        System.out.println(linkedSet.containsAll(List.of("apple","Banana","Apple")));

    }
}
