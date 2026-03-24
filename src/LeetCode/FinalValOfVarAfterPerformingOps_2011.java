package LeetCode;

public class  FinalValOfVarAfterPerformingOps_2011 {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;

        for (String s : operations){
            if(s.contains("++"))
            x+=1;
            else
            if(s.contains("--"))
            x-=1;
        }
        return x;
    }

    public int finalValueAfterOperations2(String[] operations) {
        int ans=0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].charAt(1)=='+'){
                ans++;
            }else{
                ans--;
            }
        }
        return ans;
    }
}
