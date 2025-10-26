package CollectionsJava;
/*
Given an array arr[] of non-negative integers. 
Find the length of the longest sub-sequence such that elements in the subsequence are consecutive integers, the consecutive numbers can be in any order.

Examples:

Input: arr[] = [2, 6, 1, 9, 4, 5, 3]
Output: 6
Explanation: The consecutive numbers here are 1, 2, 3, 4, 5, 6. These 6 numbers form the longest consecutive subsquence.
Input: arr[] = [1, 9, 3, 10, 4, 20, 2]
Output: 4
Explanation: 1, 2, 3, 4 is the longest consecutive subsequence.
Input: arr[] = [15, 13, 12, 14, 11, 10, 9]
Output: 7
Explanation: The longest consecutive subsequence is 9, 10, 11, 12, 13, 14, 15, which has a length of 7.
*/

import java.util.Arrays;

public class LongestConsecutiveSubSequence {
    public static void main(String[] args) {

        System.out.println("test case 1 :");
        int [] arr1 = {2, 6, 1, 9, 4, 5, 3};
        longestSubSeq(arr1);

        System.out.println("test case 2 :");
        int[] arr2 = {1, 9, 3, 10, 4, 20, 2};
        longestSubSeq(arr2);

        System.out.println("Test case 3 : ");
        int[] arr3 = {15, 13, 12, 14, 11, 10, 9};
        longestSubSeq(arr3);
                
            }
        
            private static void longestSubSeq(int[] arr) {
             
                Arrays.sort(arr);
                System.out.println(Arrays.toString(arr));
                int counter=0,ctr = 0; 

                for(int i =0 ; i < arr.length-1; i++){
                    if(arr[i] == arr[i+1]-1){
                        ctr++;
                    }else{
                        if(ctr>=counter){
                            counter=ctr+1; //Adding 1 here because while ctr breaks out on the iteration above that is still consecutive in sequence 
                            ctr=0;
                        }else{
                            ctr=0;
                        }
                    }
                }
                if(ctr>=counter){
                    counter=ctr+1; }

                System.out.println("Longest SubSequence is : "+counter);

            }
}
