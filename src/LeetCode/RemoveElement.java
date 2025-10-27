package LeetCode;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {

        int[] arr = {0,1,2,2,3,0,4,2};
        // int[] arr = {3,3};
        int val = 2;

        System.out.println(removeEl(arr,val));
        
    }
    public static int removeEl(int[] nums, int val) {

        int k = 0; // write pointer

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        System.out.println(Arrays.toString(nums));
        return k;

        // *******************
        // The solution below was declined because I was using Arrays.sort() that modifies the array 
        // And it was explicitly mentioned that the operation has to be performed in place 
        // No new arrays are to be used
        // Since Arrays are mutable object on calling Arrays.sort() it then refers to the new array created. 
        // *******************

        // if(nums.length == 0)
        //  return 0;

        //  if(nums.length==1){
        //     if(nums[0]==val)
        //     return 0;
        //     else return 1;
        //  }

        // int index=0,counter=0;
        // Arrays.sort(nums);

        // for(int i =0 ; i < nums.length;i++){
        //     if(nums[i]==val){
        //         index=i;
        //         break;
        //     }
        // }

       
        
        // int left=index;
        // int right = nums.length-1;
        // while (left<right){
        //     if(nums[right]!=val){
        //     int temp=nums[left];
        //     nums[left]=nums[right];
        //     nums[right]=temp;
        //     counter++;
        // }
        //     else{break;}
        //     left++;
        //     right--;
        // }
        
        // System.out.println(Arrays.toString(nums));

        //  if(index==0){
        //     return 0;
        // }
        // return index+counter;
    }
}
