package LeetCode;
// 11. Container With Most Water

public class ContainerWithMostWater {
    public static void main(String[] args) {
        Solution ob = new Solution();
        int[]arr = {1,8,6,2,5,4,8,3,7}; //test case
        System.out.println(ob.maxArea(arr));
    }
    
}
class Solution {
    public int maxArea(int[] height) {
        int size=height.length;
        int i =0 , j=size-1;
        int finalVol=0;
        int volume=0;
        // Select 2 pointers -- starting index of the array and the ending index 
        // keep calculating volume based on the smaller columen and size b/w the columns 
        // increment or decrement the pointer based on what pointer was last selected to caculate volume. 
        // keep comparing volumes in every step to keep a record of the largest volume recorded in the iterations. 
        while (i<j){
            int col=0;
    
            if(height[i]<=height[j]){
                col=height[i];
                volume = col*(size-1);
                i++;
                
            }
            else
            {
                col=height[j];
                volume = col*(size-1);
                j--;;
                
            }
            if(finalVol<=volume){
                finalVol=volume;
                size--;
            }else 
            size--;
        }
        return finalVol;

    }
}
