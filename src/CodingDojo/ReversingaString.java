package CodingDojo;

import java.util.Scanner;

public class ReversingaString {
    public static void main(String[] args) {

        Scanner sc = new Scanner((System.in));
        System.out.println("Please enter a string that you would like to be reversed");
        String str = sc.nextLine();
        sc.close();

        stringReversal(str);
        System.out.println("By recurssion : " + stringReversalRecurssion(str));
        System.out.println("True recursion reversal : "+stringRecursionTrueReversal(str));
    
    }

    /*
     * The approach below works but is inefficient
     * The iterations that happen in the for loop works on multiples String concatenations 
     * That could lead to many temporary Strings -- > inefficient for larger inputs 
     * The use of String Builder is encouraged in these scenarios 
     */
    public static void stringReversal(String str){
        int len = str.length();
        String reversed="";

        for(int j=len-1 ; j>=0 ; j--){
            reversed+=str.charAt(j);
        }
        System.out.println("Your reversed String is : "+ reversed);
    }

    /*
     * This approach has been marked as not true recursion because : 
     * True recursion should:
     * 1. Break the problem into a smaller version.
     * 2. Call itself with that smaller problem.
     * 3. Use the return value to build the solution.
     * Implemented true recursion below ..
     */
    public static String stringReversalRecurssion(String str){
        int len = str.length();
        String reversed="";
        while(len>0){
            reversed+=str.charAt(len-1);
            stringReversalRecurssion(str.substring(0, len-1));
            len--;
        }

        return reversed;
    }

    public static String stringRecursionTrueReversal(String str){
        if(str.isEmpty()){
            return str;
        }
        // Recursive step: reverse the substring starting from index 1, 
        // then append the first character at the end.
        return stringRecursionTrueReversal(str.substring(1))+str.charAt(0);
    }
}
