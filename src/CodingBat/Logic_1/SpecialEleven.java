package CodingBat.Logic_1;

public class SpecialEleven {
    public boolean specialEleven(int n) {
        if(n%11 == 0 || n%11==1)
            return true;
        else
            return false;
    }

}
