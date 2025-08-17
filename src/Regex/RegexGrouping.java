package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexGrouping {
    public static void main(String[] args) {
        String str = "ab abb abbb ababab abababbbbb bac abc";
        Pattern pattern = Pattern.compile("(ab)+");
        // Without grouping if the pattern was instead syntaxed as ab+ it would have looked for matches like
        // ab abb abbb abbbb and more, repeating only the value b not a, since not grouped
        // demoed below
        System.out.println("Grouoed (ab)+");
        Matcher matcher = pattern.matcher(str);
        while(matcher.find()){
            System.out.println(matcher.group());
        }
        System.out.println("Not grouped ab+");
        pattern=Pattern.compile("ab+");
        matcher = pattern.matcher(str);
        while(matcher.find()){
            System.out.println(matcher.group());
        }

        // Date Example
        String date = "2025-08-15";
        pattern =Pattern.compile("(\\d{4})-(\\d{2})-(\\d{2})");
        matcher=pattern.matcher(date);
        while(matcher.find()){
            System.out.println(matcher.group());
            System.out.println("Year: " + matcher.group(1));
            System.out.println("Month: " + matcher.group(2));
            System.out.println("Day: " + matcher.group(3));
        }
        System.out.println("Number of groups in this pattern : "+matcher.groupCount());

        // Nested grouping
        pattern=Pattern.compile("((ab)(cd))+");
        String newPat = "abcd asiofa abcd";
        matcher=pattern.matcher(newPat);
        while(matcher.find()){
            System.out.println(matcher.group());
            System.out.println(matcher.groupCount());
            System.out.println(matcher.group(1));
            System.out.println(matcher.group(2));
            System.out.println(matcher.group(3));
        }
    }
}
