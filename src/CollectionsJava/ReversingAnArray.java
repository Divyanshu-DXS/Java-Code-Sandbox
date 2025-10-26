package CollectionsJava;

import java.util.Arrays;

public class ReversingAnArray {
    public static void main(String[] args) {
        
        int[] arr1 = {1,2,3,4,5,6};
        // Using naive approach 
        reverseArrayNaiveApproach(arr1);
        System.out.println("Using Naive Approach ... "+Arrays.toString(arr1));
        System.out.println("***************** \n");
        
        int[] arr2 = {1,2,3,4,5,6};
        reverseArray2PointerApproach(arr2);
        System.out.println("Using 2 Pointer Approach ... "+ Arrays.toString(arr2));
        System.out.println("***************** \n");

            }
    // Naive approach     
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

    // 2 Pointer approach 
    public static int[] reverseArray2PointerApproach(int[] arr){
        // we define a left pointer from start of an array and a right pointer for the last element
        // we keep swapping elements from the 2 pointers and then incrememnt the left pointer and decrememnt the right one
        // until left < right

        int left =0;
        int right = arr.length-1;

        while (left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right]=temp;

            left++;
            right--;
        }

        return arr;
    }
}
