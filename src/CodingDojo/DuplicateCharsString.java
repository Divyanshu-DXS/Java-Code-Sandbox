package CodingDojo;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

/*
Given a string s, 
the task is to identify all characters that appear more than once and print each as a list containing the character and its count.

Examples:

Input: s = "geeksforgeeks"
Output: ['e', 4], ['g', 2], ['k', 2], ['s', 2]
Explanation: Characters e, g, k, and s appear more than once. Their counts are shown in order of first occurrence.

Input: s = "programming"
Output: ['r', 2], ['g', 2], ['m', 2]
Explanation: Only r, g, and m are duplicates. Output lists them with their counts.

Input: s = "mississippi"
Output: ['i', 4], ['s', 4], ['p', 2]
Explanation: Characters i, s, and p have multiple occurrences. The output reflects that with count and order preserved.
*/
public class DuplicateCharsString {
    public static void main(String[] args) {
        
        System.out.println("Test Case 1 : ");
        String s = "geeksforgeeks";
        duplicateCharCount(s);
        System.out.println("****************");

        System.out.println("Test case 2 :");
        s= "programming";
        duplicateCharCount(s);
        System.out.println("****************");

        System.out.println("Test case 3 : ");
        s= "mississippi";
        duplicateCharCount(s);
            }
        
    private static void duplicateCharCount(String s) {

        Map<Character,Integer> map = new HashMap<Character,Integer>();

        for(int i = 0 ; i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }
            else
            map.put(s.charAt(i), 1);
        }

        System.out.println("For the given String : "+ s + "\nThe count of all characters is : " + map);
        
        // printing only duplicate values 
        System.out.println("Duplicate values and count in the string is : ");
        for (Character ch : map.keySet()) {
            if(map.get(ch)>1){
                System.out.print("["+ch+":" + map.get(ch)+ "]");
            }
        }
        System.out.println();

        }
    
}
