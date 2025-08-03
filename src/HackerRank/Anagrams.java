package HackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    
    public static boolean isAnagram(String a, String b){

        // making it case insensitive
        a=a.toLowerCase();
        b=b.toLowerCase();

        // not an anagram if the strings are of different lengths
        if(a.length()!=b.length()) return false;

        // counting frequency of characters in english 0-a , 1-b, 2-c .... 25-z
        int[] freqChar = new int[26]; 
        
        // this loop iterates through the first string and increments coresponding index values based for characters found
        for(int i=0; i<a.length();i++){
            char ch = a.charAt(i);
            freqChar[ch-'a']++;
        }
        // this loop iterates through the second string and decrements coresponding index values based for characters found
        // this shall decrement the value to 0 if the frequency of characters found in second string is same as first one
        for(int i=0; i<a.length();i++){
            char ch = b.charAt(i);
            freqChar[ch-'a']--;
        }

        // checks the frequency array for charcters recorded. If either of them are > 0 that means not an anagram
        for(int num:freqChar){
            if(num!=0)
            return false;
        }
        return true;
    }

    public static boolean isAnagramArrayApproach(String a, String b){
        // making it case insensitive
        a=a.toLowerCase();
        b=b.toLowerCase();

        // not an anagram if the strings are of different lengths
        if(a.length()!=b.length()) return false;

        // converting Strings to arrays 
        char[] aArr = a.toCharArray();
        char[] bArr = b.toCharArray();

        // sort the arrays
        Arrays.sort(aArr);
        Arrays.sort(bArr);

        return Arrays.equals(aArr, bArr) ? true :false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String 1: ");
        String a = sc.nextLine();
        System.out.println("Enter String 2: ");
        String b= sc.nextLine();

        // output from general logic method without using and sorting arrays for strings 
        System.out.println(isAnagram(a,b) ? "Anagram" :"Not an Anagram");

        // output for method that converts strings to arrays and sorts and compares 
        System.out.println(isAnagramArrayApproach(a, b)? "Anagram": "Not an Anagram");
        
        sc.close();
    }
}