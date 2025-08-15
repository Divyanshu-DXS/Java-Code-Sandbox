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
        upperCase = Pattern.compile("[A-Z]");
        getMatchedPatterns(str, upperCase);

        // matches all lower case characters found
        lowercase = Pattern.compile("[a-z]");
        getMatchedPatterns(str, lowercase);

        // matches only numbers
        onlyNum = Pattern.compile("[0-9]");
        getMatchedPatterns(str, onlyNum);

        // mactches all except a pattern provided 
        picky= Pattern.compile("[^abcABC]");
        getMatchedPatterns(str, picky);

        // matches all numbers and characters
        numAndChar = Pattern.compile("[A-Za-z0-9]");
        getMatchedPatterns(str, numAndChar);
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
