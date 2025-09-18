package CollectionsJava.Maps;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDump {

    // Concurrent HasMap is similar to Hashmap, What it offeres additionally on top is :
    // It is threadSafe and provides thread safe operations without locking up the entire map
    // Allows multiple threads to operate concurrently by dividing the map into segments.
    // Supports atomic operations like putIfAbsent(), replace() and remove()
    // The default concurrency level of ConcurrentHashMap is 16
    // Inserting null objects is not possible in ConcurrentHashMap as a key or value.

    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> concHashMap = new ConcurrentHashMap<>();
        concHashMap.put("AAA",1);
        concHashMap.put("ABC",2);
        concHashMap.put("bbb",14);
        concHashMap.put("CBD",11);
        concHashMap.put("CDA",5);
        concHashMap.put("KON",19);
        System.out.println(concHashMap);
        System.out.println("Size of the map is : "+concHashMap.size());

        // putIfAbscent method of concurrent HashMap
        concHashMap.putIfAbsent("XYZ",999);
        System.out.println(concHashMap);

        // remove method
        System.out.println("Removing value 'bbb' : ");
        concHashMap.remove("bbb");
        System.out.println(concHashMap);

        // replace method
        System.out.println("Using the replace method to replace value of key 'XYZ' to : 69");
        concHashMap.replace("XYZ",999,69);
        System.out.println(concHashMap);

        // Remove method -- returns the removed value / if key not present returns null
        int removed = concHashMap.remove("KON");
        System.out.println("Key 'KON' has been removed and the value corresponding to that was : "+removed);
        System.out.println(concHashMap);

        // clearing the map
        System.out.println("CLEARING THE MAP !!!! ...");
        concHashMap.clear();
        System.out.println(concHashMap);
    }
}
