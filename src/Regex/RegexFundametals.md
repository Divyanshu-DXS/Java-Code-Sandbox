# REGEX

## What is Regex

A regular expression is a special sequence of characters that helps you match or find other strings or sets of strings, using a specialized syntax held in a pattern. <br><b>They can be used to search, edit, or manipulate text and data.</b>

Java provides the java.util.regex package for pattern matching with regular expressions.

The java.util.regex package primarily consists of the following three classes : 
- Pattern Class : Compiles the regex 
- Matcher Class : Runs the regex on an given text
- PatternSyntaxException : An exception to handle any unchecked exception. for instance any syntax error in pattern. 


## Character Classes []

- [abc] → matches any one character a or b or c.
- [a-z] → any lowercase letter.
- [A-Z] → any uppercase letter.
- [0-9] → any digit.
- [a-zA-Z0-9] → letters and digits.
- [^abc] → any character except a, b, c.




