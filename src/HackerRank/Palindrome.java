package HackerRank;

import java.util.Scanner;
// A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.
public class Palindrome {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter text to check if it is a Palindrome or not: ");
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String rev="";
        for(int i= A.length()-1; i>=0;i--){
            rev+= A.charAt((i));
        }
        
        if(A.contentEquals(rev))
        System.out.println("Yes");
        else
        System.out.println("No");

        sc.close();
    }
}
