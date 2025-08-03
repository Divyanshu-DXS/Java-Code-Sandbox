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

/* APPROACH TO SOLVING THIS : 
    Initially tied without stack, but the complexity of nesting loops to match conditonis was getting complicated. 
    Was suggested to see the Stacks approach. 
    Since stacks follow last in first out approach
    we can traverse the string from first element 
    and if it has an openeing bracket i.e. (,{, or[ we can then push this into the stack 
    else if the index has a closing bracket stored i.e. ),}, or}
    we can then check if that matches with the bracket that is on the top of the stack and see if the pair matches
    If the pair matches we have a match and we can pop that element of the stack out 
    This shall reveal the next element (another open bracket stored earlier) and whose match can then be compared. 
    if at the end of the loop the stack is empty that means all pairs matched and it was a vlid string else false. 
 */