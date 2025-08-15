package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexGrouping {
    public static void main(String[] args) {
        String str = "abcccde abc abcabcabc acd bac abbsc abc";
        Pattern pattern = Pattern.compile("(abc)+");
        Matcher matcher = pattern.matcher(str);
        while(matcher.find()){
            System.out.println(matcher.group());
        }
        String date = "2025-08-15";
        pattern =Pattern.compile("((\\d{4})-(\\d{2})-(\\d{2}))");
        matcher=pattern.matcher(date);
        while(matcher.find()){
            System.out.println(matcher.group());
        }
        System.out.println(matcher.groupCount());
    }
}
