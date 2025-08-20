package Recursion;

import java.sql.SQLOutput;

public class BasicExamples {
    public static void main(String[] args) {
        System.out.println("Recursion Examples!");

        // Add sum of all numbers from 0 - 10 and print the sum
        System.out.println("Sum of numbers 0-10 : "+ sum(10));

        // Add sum of numbers between 5 - 12 and print the sum
        int n = 5;
        int m = 12;
        System.out.println("Sum of numbers between n & m. Where n = "+ n + " & m = " +  m +" is : " + sum(n,m));
    }

    private static int sum(int i) {
        // base case would be when the  number reaches to 0
        if(i>0){
            return i + sum(i-1); // recursively calls for a value smaller than original until base case
            // 10+sum(10-1) --> 10+9+sum(9-1) -- > ..... --> 10+9+8+7..+1+sum(1-1)
        }
        else
            return 0 ;
    }

    private static int sum(int n, int m) {
        // base case for this would be when int n < m
        if(m>n){
            return m + sum(n, m-1); // recursively calls a value less than m in every call while keeping n the same
            // 12 + sum(5,12-1) -- > 12 + 11 + sum(5,11-1) .. and so on
        }
        else
            return n;

    }

}
