package CollectionsJava;

import java.security.KeyStore.Entry;
import java.util.Map;
import java.util.TreeMap;

class TreeMapDump {
    public static void main(String[] args) {
        System.out.println("TreeMap");
        Map<String, Integer> tm = new TreeMap<>();

        tm.put("Apples",12);
        tm.put("Bananas",13);
        tm.put("Cherry",122);
        tm.put("kiwis",38);
        tm.put("Aaa", 1);
        tm.put("Aaaa", 2);

        System.out.println(tm);
        System.out.println(tm.size());
        System.out.println(tm.get("Aaa"));
        tm.remove("Aaa");
        System.out.println(tm.size());
        
        for(String s : tm.keySet()){
            System.out.println("Keys : "+ s + " | Values : "+ tm.get(s));
        }
        for(int i:tm.values()){
            System.out.println(i + "Value. ");
        }
        for(Map.Entry<String, Integer> en : tm.entrySet()){
            System.out.println(en.getKey() + " : " + en.getValue());
        }
    }
}