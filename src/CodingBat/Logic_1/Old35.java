package CodingBat.Logic_1;

public class Old35 {
    public boolean old35(int n) {
        if((n%3==0 || n%5==0) && !(n%3==0 && n%5==0))
            /* or if((n%3==0 || n%5==0) && !(n%15==0))
            Since multiple of both 3&5 should evaluate to 15. TESTED.
            */
            return true;
        return false;
    }
}
