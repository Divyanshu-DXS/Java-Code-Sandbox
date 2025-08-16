package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexBasics {
    public static void main(String[] args) {
        // Literal Matching 
        String str = "This String is for reference purpose only. The literal String we are going to look for could or could not be present.";
        Pattern pattern = Pattern.compile("String"); // Finds the word "String" in text
        Matcher matcher = getMatchedPatterns(str, pattern);

        // character classes 
        str= "This is a RANDOM text to test character classes. ABC abcde AbcDeFG 0123Abc 012 abb123ads abc";
        Pattern upperCase, lowercase, onlyNum, numAndChar, picky;
        // matches all upper case characters found 
        upperCase = Pattern.compile("[A-Z]"); // to find words instead -> "[A-Z]+"
        System.out.println("UPPER CASE: ");
        getMatchedPatterns(str, upperCase);

        // matches all lower case characters found
        lowercase = Pattern.compile("[a-z]");
        System.out.println("LOWER CASE: ");
        getMatchedPatterns(str, lowercase);

        // matches only numbers
        onlyNum = Pattern.compile("[0-9]");
        System.out.println("NUMBERS: ");
        getMatchedPatterns(str, onlyNum);

        // matches all except a pattern provided 
        picky= Pattern.compile("[^abcABC]");
        System.out.println("BEING PICKY: ");
        getMatchedPatterns(str, picky);

        // matches all numbers and characters
        numAndChar = Pattern.compile("[A-Za-z0-9]");
        System.out.println("ALPHANUMERIC: ");
        getMatchedPatterns(str, numAndChar);

        // ******************************************
        // Mini Exercises
        // Match all vowels in a sentence.
        // Match all digits in "My phone: 222-333-0009".
        // Match a literal string "1.01" (don’t forget to escape the dot).
        // Match all characters except vowels.
        System.out.println();
        System.out.println("******************************************");
        System.out.println("Mini Excercises"); 

        str = "Mini Exercise Text Syntax. Author : DevDXS | Version 1.01 + Phone #: 222-333-0009";
        Pattern vowels, phoneNum, litString, noVowels;
        vowels =Pattern.compile("[aeiouAEIOU]");
        System.out.println("Vowels in the given String are: ");
        getMatchedPatterns(str, vowels);

        phoneNum = Pattern.compile("222-333-0009");
        System.out.println("Phone num present in the given String : ");
        getMatchedPatterns(str, phoneNum);
        // alternatively
        phoneNum = Pattern.compile("\\d{3}-\\d{3}-\\d{4}"); // \\d\\d\\d-\\d\\d\\d-\\d\\d\\d\\d
        System.out.println("ALternate method to get the phone # in the given String : ");
        getMatchedPatterns(str, phoneNum);

        litString = Pattern.compile("\\d\\.\\d\\d");
        System.out.println("Literal String with decimal located : + ");
        getMatchedPatterns(str, litString);

        noVowels = Pattern.compile("[^aeiouAEIOU]");
        System.out.println("No Vowels: ");
        getMatchedPatterns(str, noVowels);



    }

    private static Matcher getMatchedPatterns(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        while(matcher.find()){
            System.out.print(matcher.group()+ ", ");
        }
        System.out.println();
        return matcher;
    }
}
