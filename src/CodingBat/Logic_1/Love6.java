package CodingBat.Logic_1;

public class Love6 {
    public static void main(String[] args) {
        Love6 ob= new Love6();
        boolean res = ob.love6(-2,-4);
        System.out.println(res);

    }

    public boolean love6(int a, int b) {
        int sum = a+b;
        int diff = a-b;

        if(a==6||b==6||(sum)==6||Math.abs(diff)==6)
            return true;
        else
            return false;

    }


}
