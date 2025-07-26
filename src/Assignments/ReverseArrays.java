package Assignments;

import java.util.Scanner;

public class ReverseArrays {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the size of your array");
        int size=sc.nextInt();
        int[] arr =  new int[size];
        System.out.println("Please enter the elements of the array.");
        for (int i= 0; i<size;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Your array is: ");
        for(int i : arr){
            System.out.print(i);
        }
        System.out.println();
        //reversing the array 
        int[] newArr = new int[size];
        for(int i =0; i < size ; i++){
            newArr[i]= arr[(size-1)-i];
        }

        System.out.println("Your new reverese array is: ");
        for(int i : newArr){
            System.out.print(i);
        }
    }
}
