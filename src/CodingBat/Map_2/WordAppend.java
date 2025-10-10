package CodingBat.Map_2;
/* 
Loop over the given array of strings to build a result string like this: 
when a string appears the 2nd, 4th, 6th, etc. time in the array, append the string to the result. 
Return the empty string if no string appears a 2nd time.

wordAppend(["a", "b", "a"]) → "a"
wordAppend(["a", "b", "a", "c", "a", "d", "a"]) → "aa"
wordAppend(["a", "", "a"]) → "a"
 */

import java.util.HashMap;
import java.util.Map;

public class WordAppend {
    public String wordAppend(String[] strings) {
        
        Map<String, Integer> map = new HashMap<>();
    StringBuilder result = new StringBuilder();

    for (String str : strings) {
        int count = map.getOrDefault(str, 0) + 1;
        map.put(str, count);

        // Append when count is even (2nd, 4th, 6th, etc.)
        if (count % 2 == 0) {
            result.append(str);
        }
    }

    return result.toString();
    }
    
}
