package CodingBat.Logic_1;

public class AlarmClock {

    // this program was a prime example of operator precedence.
    public String alarmClock(int day, boolean vacation) {
        if((day > 0) && (day < 6) && (!vacation) )
            return "7:00";
        else
        if((day > 0) && (day < 6) && (vacation) )
            return "10:00";
        else
            /* In this code below I earlier stated the conditoin below as :
            if((day == 0) || (day == 6) && (!vacation) )
            because of which the code was interpreted as
            (day == 0) || (day == 6) && (!vacation)
            && takes more precedence over || so the part where it compares (day == 6) && (!vacation)  got evaluated first
            this made one use case fail, as for any case where day == 0 was true the result became automatically true,
            without comparing the next instruction.
             */
                if(((day == 0) || (day == 6)) && (!vacation) )
            return "10:00";
        else
            return "off";
    }

}
