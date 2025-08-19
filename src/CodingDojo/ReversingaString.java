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

    }
    public static void stringReversal(String str){
        int len = str.length();
        String reversed="";

        for(int j=len-1 ; j>=0 ; j--){
            reversed+=str.charAt(j);
        }
        System.out.println("Your reversed String is : "+ reversed);
    }
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
}
