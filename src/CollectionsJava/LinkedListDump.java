package CollectionsJava;
import java.util.Collections;
import java.util.LinkedList;;
public class LinkedListDump {
    public static void main(String[] args) {
        System.out.println("LinkedList");
        LinkedList<String> ll = new LinkedList<String>();
        // LinkedList can make use of most of the methods that we earlier used in the ArrayList, since it implements List
        // There are however some additoinal methods that can be used in a LinkedList to make it more effective 
        // Under the hood both ArrayList and LinkedList are built different
        // LinkedList works on nodes, every nodes contains - pointer to previous node, the data, pointer to next node. 
        ll.add("DEV");
        ll.add("DXS");
        ll.add("MASTER");
        ll.add("DIVYANSHU");

        System.out.println(ll);
        System.out.println("FirstElement: "+ ll.getFirst());
        System.out.println("Last Element: "+ ll.getLast());
        ll.addFirst("DEXTER");
        ll.addLast("SUPREME LEADER");
        System.out.println(ll);
        System.out.println(ll.getFirst());
        Collections.sort(ll);
        System.out.println(ll);
        System.out.println(ll.getFirst());
        

        
    }
}
