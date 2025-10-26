package CollectionsJava;

import java.util.Arrays;

public class ReversingAnArray {
    public static void main(String[] args) {
        
        int[] arr1 = {1,2,3,4,5,6};
        // Using naive approach 
        reverseArrayNaiveApproach(arr1);
        System.out.println("Using Naive Approach ... "+Arrays.toString(arr1));
        System.out.println("***************** \n");
        


            }
        
    private static int[] reverseArrayNaiveApproach(int[] arr) {
        
        // this approach creates a new array and we just copy elements from the orignal array to the new one, in reverse order

        int n = arr.length;
        int [] newArr = new int[n];

        for(int i = 0;i < n ;i++){
            newArr[i] = arr[n-1-i];
        }
        for(int i = 0;i < n ;i++){
            arr[i] = newArr[i];
        }
        return arr;
    }
}
