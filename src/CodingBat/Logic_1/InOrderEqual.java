package CodingBat.Logic_1;

public class InOrderEqual {
    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        if((b>a)&&(c>b))
            return true;
        else
        if(equalOk &&(b>=a)&&(c>=b))
            return true;
        else
            return false;

    }

}
