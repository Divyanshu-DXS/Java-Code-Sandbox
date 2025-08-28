package LeetCode;

class SearchInsertPosition_35 {
    public static void main(String[] args) {
        int [] nums = {1,2,3,5,6};
        int target = 4;
        System.out.println(searchInsert(nums, target));
    }
    public static int searchInsert(int[] nums, int target) {
        int index=0;
        if(nums[0]<target && target >nums[nums.length-1])
        return nums.length;
        for(int i=0; i<nums.length;i++){
            if(nums[i] == target){
                index=i; 
                break;
            }
            else 
            if(nums[i]>target)
            {index=i;
            break;}
        }
        return index;

    }
}