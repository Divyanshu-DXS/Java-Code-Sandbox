package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class RemoveElement_27 {
    public static void main(String[] args) {
        int[] nums={1,2,2,3,1,4,6,1,5};
        int val=1;

        System.out.println(removeElement(nums, val));
        
    }
    public static int removeElement(int[] nums, int val) {
        List<Integer> newSet = new ArrayList<>();
        for(int i : nums){
            if(i!=val){
                newSet.add(i);
            }
        }

        int index=0;
        for(int i : newSet){
            nums[index++]=i;
        }
        System.out.println("New Array without the given value : "+ newSet);
        System.out.print("Original Modified Array : ");
        for(int i : nums){
            System.out.print(i + " ");
        }
        return newSet.size();
    }
}
