package Assignments;

import java.util.Scanner;

class ArrayFindMinElement {
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
            System.out.print(i+" ");
        }
        System.out.println();

        int min=arr[0];

        for(int i: arr){
            if(i<=min){
                min=i;
            }
        }
        System.out.println("Minimum number is: "+ min);
    }
}