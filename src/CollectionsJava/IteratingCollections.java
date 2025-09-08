package CollectionsJava;
import java.util.*;
public class IteratingCollections {
    public static void main(String[] args) {
        
        System.out.println("Different Iteration Techniques");
        
        // Using Iterator
        List<String> names= new ArrayList<>(List.of("EMINEM", "DR DRE", "ICE CUBE","50 CENT", "SNOOP"));
        Iterator<String> it = names.iterator();
        while(it.hasNext()){
            // this iterates over the list and it.next() prints the value at the current node
            System.out.println(it.next());
        }
        System.out.println(names);

        Iterator<String> xx = names.iterator();
        while(xx.hasNext()){
            // Iterators can also help us remove any values at the time of iteration as below :
            if(xx.next().equals("DR DRE")){
                xx.remove();
        }
    }
    System.out.println("Checking the content of ArrayList after iteration and removal");
    System.out.println(names);

    // Enhanced ForEach loop 
    for(String st:names){
        System.out.println(st);
    }

    // If we were to try and remove an item while using enhanced foreach it will throw an exception 
    // Throws java.util.ConcurrentModificationException
    try{
    for(String st:names){
        if(st.equals("EMINEM")){
            names.remove(st);
        }
    }}
    catch(Exception e){
        e.printStackTrace();
    }
    System.out.println(names);
    names.add("EMINEM");
    System.out.println(names);

    // Iterating over different Collections 
    // List (ArrayList, LinkedList, etc. )
    List<String> ll = new ArrayList<String>(List.of("ABC", "DEF", "GHI", "JKL", "MNO")) ;
    for (String string : ll) {
        System.out.println(string);
    }
    // Set (HashSet, TreeSet etc.)
    Set<String> ss = new HashSet<>(Set.of("India", "Canada", "Russia", "Japan"));
    for (String string : ss) {
        System.out.println(string);
    }
    // Maps (needs entrySet())
    Map<String, Integer> map = Map.of("A", 1, "B", 2);
    for (Map.Entry<String, Integer> entry : map.entrySet()) {
    System.out.println(entry.getKey() + " => " + entry.getValue());
}
    }
}
