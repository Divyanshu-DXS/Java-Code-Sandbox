package CodingBat.Logic_1;

public class DateFashion {

    public int dateFashion(int you, int date) {

        int result;

        if(you <= 2 || date <= 2)
            result = 0;
        else
        if((you >= 8 || date >= 8) && (you > 2 || date > 2))
            result= 2;
        else
            result = 1;

        return result;
    }
}
