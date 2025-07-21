package CodingBat.Logic_1;

public class RedTicket {
    public int redTicket(int a, int b, int c) {

        if((a+b+c)==6)
            return 10;
        else
        if(a==b&&b==c)
            return 5;
        else
        if(b!=a && c!=a)
            return 1;
        else
            return 0;

    }

}
