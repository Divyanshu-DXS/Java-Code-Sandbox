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


    }
}
