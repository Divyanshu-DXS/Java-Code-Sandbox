package CollectionsJava.Maps;

import java.util.HashMap;
import java.util.Map;

public class MapsDump {
    public static void main(String[] args) {
        Map<String,Integer> mapDemo = new HashMap<>();
        mapDemo.put("key1", 1);
        mapDemo.put("Key2", 12);
        mapDemo.put("Key3", 13);
        mapDemo.put("key4", 32512);

        System.out.println(mapDemo);
        System.out.println(mapDemo.containsKey("key3"));
        System.out.println(mapDemo.containsKey("Key3")); // case sensitive

        mapDemo.remove("key4");
        System.out.println(mapDemo);
        mapDemo.put("Key4",131);
        System.out.println(mapDemo);

        // Scenario 1:
        // You’re given a string: "abracadabra".
        // How would you find the frequency of each character?

        String s= "abracadabra";
        Map<Character,Integer> charFrequency = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(charFrequency.containsKey(s.charAt(i))){
                charFrequency.put(s.charAt(i), charFrequency.get(s.charAt(i))+1);
            }
            else 
            charFrequency.put(s.charAt(i), 1);
        }
        System.out.println("Frequency of the characters in the string provided is: "+ charFrequency);

    }
}