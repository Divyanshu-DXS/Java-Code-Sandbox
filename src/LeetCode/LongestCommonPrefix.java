package LeetCode;
/*
 Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 */

 // My approach -- >
 /*
  1. Find the shortest string length first. 
  2. Then, start from that length and reduce it one by one. 
  3. At each step, compare that prefix across all strings. 
  4. If at any step prefix doesnot matches break out of that iteration and repeat with reduced length prefix. 
  If all strings share that prefix — that’s your current best match.
  */

public class LongestCommonPrefix {
    public static void main(String[] args) {
        LongestCommonPrefix ob = new LongestCommonPrefix();
        String []arr={"flower","flow","flight", "fight"};
        System.out.println(ob.longestCommonPrefixSoln(arr));

    }
    public String longestCommonPrefixSoln(String[] strs) {
        if(strs.length == 0) return ""; // if an empty array
        
        // Find the length of the shortest string
        int minLength = strs[0].length();
        for (String s : strs) {
            minLength = Math.min(minLength, s.length());
        }

        // Start from the full minLength and shrink down
        for (int len = minLength; len >= 0; len--) {
            String prefix = strs[0].substring(0, len);
            boolean isCommon = true;

            // Check if all strings start with this prefix
            for (int i = 1; i < strs.length; i++) {
                if (!strs[i].startsWith(prefix)) {
                    isCommon = false;
                    break;
                }
            }

            // If common to all, return immediately
            if (isCommon) {
                return prefix;
            }
        }

        // No common prefix found
        return "";
    }   
}
