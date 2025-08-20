package CodingBat.Logic_2;

public class LuckySum {
    public int luckySum(int a, int b, int c) {
        int sum = a+b+c;
        if(a!=13 && b!=13 && c!=13){
          return sum;
        }
        else 
        if(a==13){
          return 0;
        }
        else
        if(b==13){
          return a;
        }
        else
        return sum-c;
      }
      
}
