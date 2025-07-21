package CodingBat.Logic_1;

public class SumLimit {
    public int sumLimit(int a, int b) {
        int digitsInA = String.valueOf(a).length();
        int sum = a+b;
        int digitsInSum = String.valueOf(sum).length();

        if(digitsInA==digitsInSum)
            return sum;
        else
            return a;

    }
}
