package Recursion;

public class SumOfArray {
    public static void main(String[] args) {
        int[] arr ={12,1,4,114,14,6};
        // write a recursive function that prints the sum of a given array
        int sumArr = sum(arr,0);
        System.out.println("Sum of the elements in the arrays is : " + sumArr);
    }

    private static int sum(int[] arr,int i) {
        if(arr.length==0){
            System.out.println(" array is empty.");
        }
        // base case would be when the array reaches the the last element
        if(i<=arr.length-1)
            return arr[i] + sum(arr,i+1);
        else
            return 0;
    }
}
