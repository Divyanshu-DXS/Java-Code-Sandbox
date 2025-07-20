package CodingBat.Logic_1;

public class Less20 {
    public boolean less20(int n) {
        if(n%20==18 || n%20==19)
            return true;
        return false;
    }
}
