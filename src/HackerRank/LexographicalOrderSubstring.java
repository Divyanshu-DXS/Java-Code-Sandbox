package HackerRank;
import java.util.Scanner;

public class LexographicalOrderSubstring {
    

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k);
        String largest = s.substring(0,k);
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        int len=s.length();
        int i=0;
        
        while(i<len-k+1){
            String sub=s.substring(i,i+k);
            if(sub.compareTo(smallest)<0){
                smallest=sub;
            }else
            if(sub.compareTo(largest)>0){
                largest=sub;
            }
            i++;
        }
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}

