package CodingBat.Logic_2;
class MakeBricks {
    public boolean makeBricks(int small, int big, int goal) {
        // Attenmpt -1
          // if((1*small+5*big)>=goal || 1*small%goal==1 || 5*big%goal==5)
          // return true;
          // else
          // return false;
          
        // Attempt -2   
          
        //   if((1*small+5*big)>=goal){
        //     if((1*small+5*big)==goal)
        //     return true;
        //     else
        //     if(1*small==goal || 5*big==goal)
        //     return true;
        //     else 
        //     if ((1*small+5*big)%goal==1 || ((1*small+5*big)%goal)%5==0)
        //     return true;
        //     else 
        //     return false;
        //   }
        //   else 
        //   return false;
          
        // Attempt -3
        // Put in conditoins to evaluate the false results, rather than evaluating the true ones. 
        // Once all the false conditoins result out false, true ones gets sorted. 
        
          // Calculate if the sum total of all bricks is less than goal - directly fails
          if((1*small+5*big)<goal)
          {
            return false;
          } // if not check how many bricks are left if multiples of 5s are taken off.
            // if remainder is greater than total small bricks provided - fails -- > else true
          else if(goal%5>small)
          {
            return false;
          }
          else
          return true;
        }
        
}