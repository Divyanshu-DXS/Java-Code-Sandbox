package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {
        // Lets try with a simple Regex function to find all words starting with upper case letters in a given string
        String str = "This is An Example text that we Gotta123 check out!";
        // Regex pattern given below -- checking words starting with  upper case characters
        Pattern pattern = Pattern.compile("\\b[A-Z][a-zA-Z0-9]*\\b");
        // Matcher class to operate on a string using the defined Regex
        Matcher matcher = pattern.matcher(str);
        
        // matcher then provides us several functions to get results based on different operations as we desire 
        while(matcher.find()){
            System.out.println(matcher.group());
        }

        // trying to get a pattern that finds all words that start with an upper case character and end with 'ing'
        str= "This is A new String. Testing this to Check Pattern Matching. Hopefully this thing works";
        // expected output =[String, Testing, Matching], not 'thing'
        pattern=Pattern.compile("\\b[A-Z][a-zA-Z0-9]*ing\\b");
        matcher=pattern.matcher(str);
        while(matcher.find()){
            System.out.println(matcher.group());
        }

        // Testing Regex to find just numbers in text 
        str = "This is a Numb3r3d text, 012, 2, 1234 345.65, 1441, Text0012, text101 are some set of numbers we would like to t3st the operation on.";
        pattern = Pattern.compile("\\d+"); // finds all the occurrences of any numbers, single or grouped
        Pattern pattern2 = Pattern.compile("\\b\\d+(\\.\\d+)?\\b"); //should find all numbers that exist by themselves and are not grouped with any non-numeric characters 
        Pattern pattern3 = Pattern.compile("\\b\\w+\\d\\b"); //Should only find words that end with numbers 
        
        matcher=pattern3.matcher(str);
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
