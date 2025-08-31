package GeneralProgrammingAndConcepts;

import java.util.StringTokenizer;

public class StringMethods {
    public static void main(String[] args) {
        String s = "Abcdefghijklmasiohfaiojfopwj";

        System.out.println(s.charAt(0));
        System.out.println(s);
        System.out.println(s.replace('f','x'));
        s = "This is a new String, value, attempting functions on this.";
        System.out.println(s.replace('a', 'x'));
        System.out.println(s.replace("is", "izz")); // Does not modify original string
        System.out.println(s.substring(2));
        System.out.println(s.substring(0,4));
        System.out.println(s.startsWith("This"));
        System.out.println(s.startsWith("Thizz")); // false because original string was not modified
        char[] charArr = s.toCharArray();
        System.out.println(charArr);
        System.out.println(s.contains("new"));
        System.out.println(s.codePointAt(s.indexOf('a'))); // returns character unicode value -- ascii value
        System.out.println((int)'a'); // testing ascii value of a character
        
        // String Parsing 
        // Parsing to another data types
        String num ="123";
        int n = Integer.parseInt(num);
        System.out.println(n);
        double d = Double.parseDouble(num);
        System.out.println(d);

        // using split()
        String newSt = "This is a space separated String value. That also has, commas and . , periods and ;; semicolons ";
        String[] parsedSt = newSt.split(", ; #");
        for(String stri: parsedSt){System.out.println(stri);}

        // Using tokenizer, this is legacy and split() is usually preferred instead. 
        String str2 = " one two three ";
        StringTokenizer tokenz = new StringTokenizer(str2);
        while(tokenz.hasMoreTokens()){
            System.out.println(tokenz.nextToken());
        }

    }
}
