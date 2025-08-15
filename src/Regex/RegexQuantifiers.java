package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuantifiers {
    public static void main(String[] args) {
        
        String str = "Random text generated009 001-201-3300 for testing quantifiers. 12345This should help!";
        Pattern pattern = Pattern.compile("\\w*");
        Matcher matcher = pattern.matcher(str);

        while(matcher.find()){
            System.out.println(matcher.group());
        }
    
        Pattern numOfDigits, wordFollowedByDigits, htmlTags; 
        // numOfDigits - Match a number with 2–5 digits:
        numOfDigits = Pattern.compile("\\d{2,5}");
        matcher=numOfDigits.matcher(str);
        while(matcher.find()){
            System.out.println(matcher.group());
        }

        // wordFollowedByDigits - Match a word(only alphabets) followed by one or more digits:
        wordFollowedByDigits = Pattern.compile("[A-Za-z]+\\d+");
        matcher=wordFollowedByDigits.matcher(str);
        while(matcher.find()){
            System.out.println(matcher.group());
        }

        // htmlTags - Match HTML tags
        String html="<div> This is a section </div> <p>New Paragraph</p> </html>";
        htmlTags = Pattern.compile("<.+?>"); // Lazy Quantifier 
        matcher = htmlTags.matcher(html);
        while(matcher.find()){
            System.out.println(matcher.group());
        }

        // Match all words that appear exactly 4 letters long.
        Pattern word4chars = Pattern.compile("\\b\\w{4}\\b");
        matcher = word4chars.matcher(str);
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
