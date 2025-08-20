package Recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Printing factorial of a number using Recursion");
        int n = 10;
        int fact= factorial(n);
        System.out.println("Factorial of number : "+n+" is : "+fact);
    }

    private static int factorial(int n) {
        // base case would be when the number n reaches 1
        if(n>1)
            return n*factorial(n-1);
        else
            return 1;
        // this shall print the factorial of a number
        // 10*9*8*7..2*1
    }
}
