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

}
