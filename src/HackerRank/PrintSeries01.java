package HackerRank;

import java.util.Scanner;


/*
XXXXX

We use the integers a, b, and n to create the following series:
(a+2^0.b) (a+2^0.b+2^1.b) (a+2^0.b+2^1.b+2^2.b) ... (a+2^0.b+2^1.b+2^2.b .... + 2^(n-1).b)
You are given q queries in the form of a, b, and n . 
For each query, print the series corresponding to the given a, b, and n values as a single line of  space-separated integers.
Output Format

For each query, print the corresponding series on a new line. 
Each series must be printed in order as a single line of  space-separated integers.

Sample Input: 
2
0 2 10
5 3 5

Sample Output : 
2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98 

XXXXX
*/
public class PrintSeries01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int sum=a+b;
            System.out.print(sum+" ");
            for(int j=1;j<n;j++){
                sum+=Math.pow(2, j)*b;
                System.out.print(sum+" ");
            }
            System.out.println();
        }
        in.close();
    }
}
