package LeetCode;

public class MinOpsToMakeArrayDivisibleByK_3512 {
    public int minOperations(int[] nums, int k) {
        int sum = 0; 
        for (int i = 0; i < nums.length ; i++){
            sum += nums[i];
        }

        if (sum < k){
            System.gc();
            return sum;
        }
        else
        if(sum == k){
            System.gc();
            return 0;
        }
        else
        System.gc();
        return sum%k;

    }
}