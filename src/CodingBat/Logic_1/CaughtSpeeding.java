package CodingBat.Logic_1;

public class CaughtSpeeding {
    public int caughtSpeeding(int speed, boolean isBirthday) {
        int res;

        if(!isBirthday){
            if (speed <= 60)
                res=0;
            else if(speed>60 && speed <=80)
                res=1;
            else
                res=2;
        }
        else{
            if (speed <= 65)
                res=0;
            else if(speed>65 && speed <=85)
                res=1;
            else
                res=2;
        }
        return res;
    }

}
