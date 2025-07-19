package CodingBat.Logic_1;

public class GreenTicket {
    public int greenTicket(int a, int b, int c) {
        if(a!=b && b!=c && a!=c)
            return 0;
        else
        if ((a==b || b==c || a==c) && !(a==b && b==c) )
            return 10;
        else
            return 20;
    }

}
