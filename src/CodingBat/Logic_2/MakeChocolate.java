package CodingBat.Logic_2;

public class MakeChocolate {
    public int makeChocolate(int small, int big, int goal) {
        if((small+5*big)<goal)
        return -1;
        else
        if(goal%5>small){
          return -1;
        }
        else
         if(goal==5*big){
           return 0;
         }
         else
         if
         (goal>5*big){
           return goal - 5*big;
         }else
         return 
         goal - ((goal/5)*5);
        
      }
}
