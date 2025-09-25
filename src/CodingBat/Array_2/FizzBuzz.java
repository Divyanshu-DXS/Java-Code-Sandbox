package CodingBat.Array_2;
/*
* This is slightly more difficult version of the famous FizzBuzz problem which is sometimes given as a first problem for job interviews.
* (See also: FizzBuzz Code.)
* Consider the series of numbers beginning at start and running up to but not including end,
* so for example start=1 and end=5 gives the series 1, 2, 3, 4.
* Return a new String[] array containing the string form of these numbers,
* except for multiples of 3, use "Fizz" instead of the number,
* for multiples of 5 use "Buzz",
* and for multiples of both 3 and 5 use "FizzBuzz".

fizzBuzz(1, 6) → ["1", "2", "Fizz", "4", "Buzz"]
fizzBuzz(1, 8) → ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7"]
fizzBuzz(1, 11) → ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"]
* */

public class FizzBuzz {
    public String[] fizzBuzz(int start, int end) {
        String [] arr = new String[end-start];
        int index=0;
        for(int i=start ; i < end ; i++){
            if(i%(15)==0)
                arr[index] = "FizzBuzz";
            else if(i%3==0)
                arr[index]="Fizz";
            else if(i%5==0)
                arr[index]="Buzz";
            else
                arr[index]=String.valueOf(i);

            index++;
        }
        return arr;
    }
}
