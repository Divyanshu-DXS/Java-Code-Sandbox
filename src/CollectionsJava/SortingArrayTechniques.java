package CollectionsJava;

import java.util.Scanner;

public class SortingArrayTechniques {
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

        //Below are various sorting methods called. You can un-comment the one you need and try run. 

        SortingArrayTechniques ob = new SortingArrayTechniques();     
           
        // Sorting techniques -- Bubble Sort
        // System.out.println("Bubble Sort");
        // ob.bubbleSort(arr);
        
        // Sorting techniques -- Insertion Sort
        System.out.println("Insertion Sort");
        ob.insertionSort(arr);

        System.out.println("Sorted Array : ");
        for(int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();


    }

    public int[]bubbleSort(int[]arr){
        int size=arr.length;
        int swap;
        for (int i=0; i < size;i++){
            for (int j=i+1;j<size;j++){
                if(arr[i]>arr[j]){
                    swap=arr[i];
                    arr[i]=arr[j];
                    arr[j]=swap;
                }
            }
        }
        return arr;
    }

    private int[] insertionSort(int[] arr) {

        for(int i=1;i<arr.length;i++){
            int index=i-1;
            int currElement = arr[i];
            while(index>=0 && currElement<arr[index]){
                arr[index+1]=arr[index];
                index--;
            }
            arr[index+1]=currElement;
        }
        return arr;
    }
}
