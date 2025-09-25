package CodingBat.Array_2;

/*
Return an array that contains the exact same numbers as the given array,
but rearranged so that all the even numbers come before all the odd numbers.
Other than that, the numbers can be in any order. You may modify and return the given array, or make a new array.


evenOdd([1, 0, 1, 0, 0, 1, 1]) → [0, 0, 0, 1, 1, 1, 1]
evenOdd([3, 3, 2]) → [2, 3, 3]
evenOdd([2, 2, 2]) → [2, 2, 2]
* */

public class evenOdd {
    public int[] evenOdd(int[] nums) {
        int swap=0;
        int i =0 ;
        int j =nums.length-1;
        while(i<=j){
            if(nums[i]%2!=0){
                if(nums[j]%2==0){
                    swap=nums[i];
                    nums[i]=nums[j];
                    nums[j]=swap;
                    j--;
                    i++;
                }
                else
                    j--;
            }else
                i++;
        }

        return nums;
    }
}
