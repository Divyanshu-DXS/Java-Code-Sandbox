package CodingBat.Logic_2;

public class BlackJack {
    public int blackjack(int a, int b) {
        if(a<=21 &&b<=21)
        {
          if((21-a)>(21-b))
          return b;
          else
          return a;
        }
        else
        if(a>21 &&b>21)
        return 0;
        else 
        if(a>21)
        return b;
        else
        return a;
      }
}
