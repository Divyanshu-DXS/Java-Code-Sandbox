package CollectionsJava;

import java.util.*;

public class HashTableDump {
    public static void main(String[] args) {
        Map<String,Integer> hsTable = new Hashtable<>();
        hsTable.put("First",1);
        hsTable.put("Second",2);
        hsTable.put("Third",3);
        hsTable.put("Fourth",4);
        hsTable.put("Fifth",5);
        hsTable.put("Sixth",6);

        System.out.println(hsTable);
        // Hashtable does not allow null values or keys
        // On the contrary hashMap allows for one null key and number of null vales
        try{
        hsTable.put(null,134);
        System.out.println(hsTable);}
        catch (Exception e){
            e.printStackTrace();
            System.err.println("Null Pointers not allowed in HashTables");
        }
        // Hashtable is synchronized, whereas HashMap is not
        // Hashtable is considered legacy code. There's nothing about Hashtable that can't be done using HashMap or derivations of HashMap

    }
}
