package CodingBat.Logic_1;

public class Near10 {
    public boolean nearTen(int num) {
        if((num%10>=0&&num%10<=2)||(num%10>=8&&num%10<=9))
            return true;
        return false;
    }
}
