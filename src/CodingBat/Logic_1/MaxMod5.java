package CodingBat.Logic_1;

// this question felt tricky, because concatenating all conditions together was not working so had to write it seperately.
public class MaxMod5 {
    public int maxMod5(int a, int b) {
        if(a!=b){
            if(a%5==b%5){
                if(a>b)
                    return b;
                else
                    return a;
            }else
            {
                if(a>b)
                    return a;
                else
                    return b;
            }
        }
        return 0;

    }
}
