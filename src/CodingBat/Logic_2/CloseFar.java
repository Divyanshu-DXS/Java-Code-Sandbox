package CodingBat.Logic_2;

public class CloseFar {
    public static void main(String[] args) {
        CloseFar ob = new CloseFar();
        System.out.println(ob.closeFar(8, 9, 10));
        
    }
    public boolean closeFar(int a, int b, int c) {
        int diffAB = Math.abs(a-b);
        int diffAC = Math.abs(a-c);
        int diffBC = Math.abs(b-c);
        
        // Attempt -1 
        // if((diffAB >1 && diffAC >1)||(diffAB<=2 && diffAC<=2)){
        //   return false;
        // }
        // else
        // return true;
        
        // Attempt -2
        //   if((diffAB > 1 && diffAC>1) || (diffAB < 1 && diffAC<1)){
        //     return false;
        //   }else
        //   if(diffAB<=2 && diffAC<=2){
        //     return false;
        //   }
        //   else
        //   return true;
      
        // Attempt -3
        if((diffAB<=1 || diffAC<=1) && !(diffAB<=1 && diffAC<=1))
        {
          if ((diffAB >=2 && diffBC>=2) || (diffAC>=2&&diffBC>=2)){
            return true;
          }else
          return false;
        }
        else
        return false;
      }
      
}
