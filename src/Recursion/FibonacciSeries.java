package Recursion;

public class FibonacciSeries {
    public static void main(String[] args) {
        // Printing Fibonacci sequence up-til n number of iterations
        // that means if n = 5 : Fibonacci sequence is going to be 0,1,1,2,3
        // if n =9 : Fibonacci sequence is going to be 0,1,1,2,3,5,8,13,21

        System.out.println("Fibonacci Series");
        int n =10; // number of elements needed in the sequence
        for(int i=0;i<n;i++){
            System.out.print(fibonacci(i)+" "); // prints fibonacci sequence
        }
    }

    private static int fibonacci(int n) {
        // base case would be when the sequence iteration number reaches n
        if (n <= 1) {
            return n;
        }
        // Recursive case: Sum of the two preceding Fibonacci numbers
        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
