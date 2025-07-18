package CodingBat.Logic_1;

public class AnswerCell {
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if(isAsleep || isMorning &&(!isMom))
            return false;
        else
        if((isMorning && isMom)&&isAsleep)
            return true;
        else
            return true;
    }
}
