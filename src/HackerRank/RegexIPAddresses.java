package HackerRank;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class RegexIPAddresses {

        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            while(!in.hasNext("exit")){
                String IP = in.next();
                System.out.println(IP.matches(new MyRegex().pattern));
            }

        }
    }
    class MyRegex{
        String pattern="((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";
        /*
        25[0-5]          → matches 250–255
        2[0-4][0-9]      → matches 200–249
        [01]?[0-9][0-9]? → matches 0–199 with optional leading zeros

        [01]?[0-9][0-9]? : explained below
        [01]? → optional leading 0 or 1
        [0-9] → mandatory digit
        [0-9]? → optional second digit
        This allows numbers: 0, 00, 01, 1, 10, …, 199
         */

}
