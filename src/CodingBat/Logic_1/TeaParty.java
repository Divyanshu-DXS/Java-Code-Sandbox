package CodingBat.Logic_1;

public class TeaParty {
    public int teaParty(int tea, int candy) {
        if(tea < 5 || candy < 5)
            return 0;
        if ((tea>=5 && candy>=5) && (tea>=(candy*2)||candy>=(tea*2)))
            return 2;
        return 1;
    }
}
