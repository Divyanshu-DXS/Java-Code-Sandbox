package CollectionsJava;

public class FirstAndLastOccurenceInArray {

/*
Given a sorted array arr with possibly some duplicates, the task is to find the first and last occurrences of an element x in the given array.
Note: If the number x is not found in the array then return both the indices as -1.

Examples:

Input: arr[] = [1, 3, 5, 5, 5, 5, 67, 123, 125], x = 5
Output: [2, 5]
Explanation: First occurrence of 5 is at index 2 and last occurrence of 5 is at index 5
Input: arr[] = [1, 3, 5, 5, 5, 5, 7, 123, 125], x = 7
Output: [6, 6]
Explanation: First and last occurrence of 7 is at index 6
Input: arr[] = [1, 2, 3], x = 4
Output: [-1, -1]
Explanation: No occurrence of 4 in the array, so, output is [-1, -1]
*/
    public static void main(String[] args) {

        System.out.println("Test case 1 : ");
        int[] arr = {1, 3, 5, 5, 5, 5, 7, 123, 125};
        int x = 7;
        fnlOccurences(arr, x);

        System.out.println("Test case 2: ");
        int[]arr1= {1, 3, 5, 5, 5, 5, 67, 123, 125};
        fnlOccurences(arr1, 5);

        System.out.println("Test Case 3 : ");
        int[] arr3 ={1,2,3};
        fnlOccurences(arr3, 4);
                
            }
        
            private static void fnlOccurences(int[] arr, int x) {
            int fIndex=-1;
            int lIndex=-1;
            
            for (int i=0 ; i < arr.length;i++) {
                if(arr[i]==x){
                    fIndex=i;
                    break;
                }
            }

            if(fIndex != -1){
                for(int i = fIndex; i<arr.length;i++){
                    if(arr[i] == x){
                        lIndex= i ; 
                    }
                }
            }

            System.out.println("first index : " + (fIndex) + "\nLast index : "+(lIndex));


            }
}
