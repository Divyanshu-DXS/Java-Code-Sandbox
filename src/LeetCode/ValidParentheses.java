package LeetCode;

import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack <Character> st = new Stack<>();

        for(char ch: s.toCharArray()){
            if(ch=='('||ch=='{'||ch=='['){
                st.push(ch);
            }
            else 
            {
                if(st.isEmpty()) return false;
                 
                char topElement =st.peek();

                if((ch==')'&&topElement=='(') ||
                (ch=='}'&&topElement=='{') || 
                (ch==']'&&topElement=='[')){
                st.pop();}
                else return false;
            }
        } 
        return st.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter paranthese sequence to test: ");
        String s = sc.nextLine();

        System.out.println("For sequence : " + s + " Result = " + isValid(s));
    }
}
