package CodingBat.Logic_1;

public class SquirrelPlay {
    public boolean squirrelPlay(int temp, boolean isSummer) {
        boolean res;
        if(!isSummer){
            if(temp >= 60 && temp <=90){
                res = true;
            }else
                res=false;
        } else
        {
            if(temp >= 60 && temp <=100){
                res = true;
            }else
                res=false;
        }
        return res;
    }

}
