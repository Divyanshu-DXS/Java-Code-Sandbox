package LeetCode;

public class NumOfGoodPairs_1512 {
    public int numIdenticalPairs(int[] nums) {
        // optimized 
        int count=0; 
        int[] freqArr = new int[101]; // Creating an array to store frequency of how many times repetition occurs within the original array -- 1 <= nums[i] <= 100

        // traversing the array + count keeps a record of number of good pairs 
        for(int i : nums){

            count+=freqArr[i]++; 
            /* freqArray checks for any eixisting occurence within for freqArr[i] (the element in nums is used as index here)
            if not we update it to 1
            if yes it get incremented by 1 again
            count then keeps track of number of good pairs 
            */
        }
        return count;
    }
    public int numIdenticalPairs_BruteApproach(int[] nums) {

        int pairsCount=0; 

        for(int i=0 ; i < nums.length ; i++){
            for (int j=i+1 ; j < nums.length ; j++){
                if(nums[i]==nums[j])
                pairsCount++;
            }
        }
        return pairsCount;
    }
}
