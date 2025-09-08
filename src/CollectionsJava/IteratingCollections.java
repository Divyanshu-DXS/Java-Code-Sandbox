package CollectionsJava;
import java.util.*;
public class IteratingCollections {
    public static void main(String[] args) {
        
        System.out.println("Different Iteration Techniques");
        List<String> names= new ArrayList<>(List.of("EMINEM", "DR DRE", "ICE CUBE","50 CENT", "SNOOP"));

        // Unlike Arrays ArrayLists can be directly printed using sout
        // That is because ArrayLists and other collections that implement collection framework override the toString() method
        System.out.println("PRINTING DIRECTLY >>>");
        System.out.println(names);
        System.out.println();

        // Using for loop - the very basic approach
        System.out.println(">>> FOR LOOP >>>");
        for(int i=0;i<names.size();i++){
            System.out.println(names.get(i));
        }
        System.out.println(">>> FOR LOOP ENDS >>>");
        System.out.println();

        // Enhanced ForEach loop
        System.out.println(">>> ENHANCED FOR EACH LOOP >>>");
        for(String st:names){
            System.out.println(st);
        }
        System.out.println(">>> ENHANCED FOR EACH LOOP ENDS >>>");
        System.out.println();

        // Using Iterator
        System.out.println(">>> ITERATOR >>>");
        Iterator<String> it = names.iterator();
        while(it.hasNext()){
            // this iterates over the list and it.next() prints the value at the current node
            System.out.println(it.next());
        }
        System.out.println(">>> ITERATOR ENDS >>>");
        System.out.println();

        // The importance of Iterators
        // Iterators can also help us remove any values at the time of iteration as below :
        Iterator<String> xx = names.iterator();
        System.out.println("Removing an element from the arrayList - \"DR DRE\"");
        while(xx.hasNext()){
            if(xx.next().equals("DR DRE")){
                System.out.println("Element has been removed");
                xx.remove();
              }
          }
        System.out.println("Checking the content of ArrayList after iteration and removal");
        System.out.println(names);
        System.out.println();

        // If we were to try and remove an item while using enhanced foreach or a for loop it will throw an exception
        // Throws java.util.ConcurrentModificationException

        System.out.println("Testing what happens if we try to remove an item while using a for each loop");
        try{
        for(String st:names){
            if(st.equals("EMINEM")){
                names.remove(st);
            }
        }}
        catch(Exception e){
            e.printStackTrace();
        }
        // You can observe that the item has been removed but it ends up throwing an exception which in real time scenarios can be problematic
        System.out.println(names);
        // Adding back the elements deleted on the same indices
        names.add(1,"DR DRE");
        names.add(0,"EMINEM");
        System.out.println(names);
        System.out.println();

        System.out.println("Iterating over different Collections ... ");
        System.out.println();
        // List (ArrayList, LinkedList, etc. )
        System.out.println("LISTS ... ");
        List<String> ll = new ArrayList<String>(List.of("ABC", "DEF", "GHI", "JKL", "MNO")) ;
        for (String string : ll) {
            System.out.println(string);
        }
        System.out.println();
        // Set (HashSet, TreeSet etc.)
        System.out.println("SETS ... ");
        Set<String> ss = new HashSet<>(Set.of("India", "Canada", "Russia", "Japan"));
        // For each
        for (String string : ss) {
            System.out.println(string);
        }
        // Iterartor
        System.out.println(">>> Using Iterator now : ");
        Iterator<String> setItr = ss.iterator();
        while(setItr.hasNext()){
            System.out.println(setItr.next());
        }
        System.out.println();
        // Maps (needs entrySet())
        System.out.println("MAPS ... ");
        System.out.println("Using EntrySet");
        Map<String, Integer> map = Map.of("A", 1, "B", 2);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
        System.out.println(entry.getKey() + " => " + entry.getValue());
        }
        // Using for each loop to iterate over keyset and get corresponding values
        System.out.println("Using For loop iteration over keyset and getting values");
        for(String str : map.keySet()){
            System.out.println("key : "+str+ " -> Value : "+map.get(str));
        }

        System.out.println();
        System.out.println("XXXX ITERATION XXXX");
    }
}
