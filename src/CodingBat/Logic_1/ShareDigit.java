package CodingBat.Logic_1;

public class ShareDigit {
    public boolean shareDigit(int a, int b) {
        int fnA=a%10;
        int snA=a/10;

        int fnB=b%10;
        int snB=b/10;

        if(fnA==fnB||snA==fnB ||fnA==snB||snA==snB )
            return true;
        else
            return false;
    }

}
