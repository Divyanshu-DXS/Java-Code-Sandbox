package CodingBat.Logic_1;

public class WithoutDoubles {
    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if (noDoubles && die1 == die2 && (die1 == 6 || die2 ==6))
            return 7;
        else
        if (noDoubles && die1 == die2)
            return die1+die2+1;
        else
        if (!noDoubles)
            return die1+die2;
        else
            return die1+die2;
    }

}
