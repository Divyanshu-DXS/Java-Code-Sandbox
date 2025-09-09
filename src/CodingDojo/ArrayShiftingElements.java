package CodingDojo;
/*
Problem : Rotate an Array

Goal: Practice array manipulation and thinking about “shifting elements.”

Task:
Write a function that rotates an array by k positions to the right.

Examples:

Input: arr = [1, 2, 3, 4, 5, 6, 7], k = 3
Output: [5, 6, 7, 1, 2, 3, 4]

Input: arr = [-1, -100, 3, 99], k = 2
Output: [3, 99, -1, -100]
 */

import java.util.Arrays;


public class ArrayShiftingElements {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7,8};
        int k =3; //shifting key -> by how many elements is the array to be rotated
        System.out.println("orignal array is : "+ Arrays.toString(num));
        rotateElements(num,k);
        System.out.println("Array elements rotated by k = "+k+" are ");
        System.out.println(Arrays.toString(num));

    }
    // Brute approach
    private static void rotateElements(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // handle k > n

        for (int i = 0; i < k; i++) {
            int last = arr[n - 1];
            for (int j = n - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = last;
        }
    }
}
