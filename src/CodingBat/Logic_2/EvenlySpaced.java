package CodingBat.Logic_2;

public class EvenlySpaced {
    public boolean evenlySpaced(int a, int b, int c) {
        int ab = Math.abs(a-b);
        int ac = Math.abs(a-c);
        int bc = Math.abs(b-c);
        
        if((a==b || b==c || a==c) && !(a==b && a==c))
        return false;
        if(ab==ac || ab==bc || ac==bc)
        return true;
        return false;
      }
      
}
