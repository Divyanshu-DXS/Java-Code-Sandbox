package CollectionsJava;
import java.util.HashMap;
import java.util.Map;
import java.util.HashMap;
public class HashMapDump {
    public static void main(String[] args) {
        HashMap<String, Integer> hs = new HashMap<String, Integer>();
        hs.put("Key1 : ", 1);
        hs.put("Key2 : ", 2);
        hs.put("Key3 : ", 3);
        hs.put("Key4 : ", 4);
        System.out.println(hs);
        hs.put("Key1 : ", 12012);
        System.out.println(hs);
        System.out.println(hs.get("Key4 : "));
        hs.remove("Key2 : ");
        System.out.println(hs);
        System.out.println(hs.size());

        // Looping through a HashMap
        for(String i: hs.keySet()){
            System.out.println(i);
        }
        for(int j: hs.values()){
            System.out.println(j);
        }
        for(String j: hs.keySet()){
            System.out.println(j+ ""+ hs.get(j));
        }
        System.out.println(hs.keySet());
        System.out.println(hs.values());
        for(String s : hs.keySet()){
            System.out.println(s + " " + hs.get(s));
        }
        for(Map.Entry<String,Integer>mapentry:hs.entrySet()){
            System.out.println("Keys: "+mapentry.getKey()+" Values: "+mapentry.getValue());
        }
    }
}
