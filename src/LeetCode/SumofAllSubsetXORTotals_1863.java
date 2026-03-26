package LeetCode;

public class SumofAllSubsetXORTotals_1863 {
    public int subsetXORSum(int[] nums) {
        return calcXorRec(nums,0,0);
    }

    public int calcXorRec(int [] nums, int index, int currentXor){
        if(index==nums.length){
            return currentXor;
        }

        // calculating individual xors
        int indXor = calcXorRec(nums, index+1, currentXor);
        // calculating subset xors
        int subsetXor = calcXorRec(nums, index+1, currentXor^nums[index]);

        return indXor + subsetXor;
    }
}
