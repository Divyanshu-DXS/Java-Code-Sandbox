package LeetCode;
/*
You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.

 

Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
Example 2:

Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].
Example 3:

Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].
 */

import java.util.Arrays;

public class PlusOne_66 {
    public static void main(String[] args) {
        int [] num ={1,2,3,4};
        System.out.println(Arrays.toString(plusOne(num)));
        num = new int[]{2,0,9,9};
        System.out.println(Arrays.toString(plusOne(num)));
        num = new int[]{9,9,9,9};
        System.out.println(Arrays.toString(plusOne(num)));
    }
    public static int[] plusOne(int[] digits) {
        if(allNines(digits)){
            int [] newArr = new int[digits.length+1];
            newArr[0]=1;
            for(int i =1;i<newArr.length;i++){
                newArr[i]=0;
            }
            return newArr;
        }
        else 
        {
            // Start from the last digit
            for (int i = digits.length - 1; i >= 0; i--) {
                if (digits[i] < 9) {
                    digits[i]++; // No carry needed
                    return digits;
                }
                digits[i] = 0; // If 9, set to 0 and continue loop
            }
            return digits;
        
        }
    }
    public static boolean allNines(int[] nums){
        for(int i =0; i <nums.length;i++){
            if(nums[i]!=9)
            return false;
        }
        return true;
    }
}
