package CollectionsJava.Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetDump {
    public static void main(String[] args) {
        Set<Integer> setDump = new HashSet<>();
        setDump.add(12);
        setDump.add(1);
        setDump.add(127);
        setDump.add(29);
        System.out.println(setDump);
        // size
        System.out.println(setDump.size());
        // contains 
        System.out.println(setDump.contains(12));
        
        // TRY CHALLENGE 
        // Given an array, return true if any value appears at least twice.
        int[] nums = {12,3,4,12,4,2,1,52};
        Set<Integer> hs = new HashSet<>();
        boolean result=false;
        for(int num : nums){
            if(hs.contains(num)) result=true;
            hs.add(num);
        }
        System.out.println((result)?"Duplicates exist" : "No duplicates");
        // DONE

    }
}
