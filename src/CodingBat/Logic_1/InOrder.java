package CodingBat.Logic_1;

public class InOrder {
    public boolean inOrder(int a, int b, int c, boolean bOk) {
        if (bOk && (c>b))
            return true;
        else if ((b>a)&&(c>b))
            return true;
        else
            return false;
    }

}
