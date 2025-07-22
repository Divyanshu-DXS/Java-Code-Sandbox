package CodingBat.Logic_2;

public class LoneSum {
    public int loneSum(int a, int b, int c) {
        int sum = a+b+c;
        if(a==b && b==c){
          return 0;
        }
        else 
        if (a!=b && b!=c && c!=a){
          return sum;
        }
        else
        if(a==b){
          return sum - 2*a;
        }else
        if(a==c){
          return sum - 2*c;
        }
        else 
        return sum -2*b;
      }
      
}
