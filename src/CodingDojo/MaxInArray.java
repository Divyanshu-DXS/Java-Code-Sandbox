package CodingDojo;


import java.util.Scanner;

public class MaxInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of the array");
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i =0 ; i<n;i++){
            System.out.print("Enter element #"+(i+1)+" : ");
            arr[i]=sc.nextInt();
        }
        int maxValue = findMax(arr);
        System.out.println("Max value in provided array is : "+ maxValue);
        int maxValueRecursion = findMaxRecursion(arr,0);
        System.out.println("Calculating max value using recursion : "+maxValueRecursion);
        sc.close();
    }

    private static int findMax(int[] arr) {
        if(arr==null || arr.length==0){
            throw new IllegalArgumentException("Array provided is empty. Please try again.");
        }
        int max = arr[0];
        for(int i : arr){
            if(i>=max) max=i;
        }
        return max;
    }

    private static int findMaxRecursion(int[]arr, int index){
        if(index==(arr.length-1)){
            return arr[index];
        }
        int maxArrRemaining = findMaxRecursion(arr,index+1);
        return Math.max(maxArrRemaining,arr[index]);
    }
}
