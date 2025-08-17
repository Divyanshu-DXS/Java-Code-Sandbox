package HackerRank;
import java.util.*;

public class ArrayListLineQueryProblem {
    /*
    Sometimes it's better to use dynamic size arrays.
    Java's Arraylist can provide you this feature. Try to solve this problem using Arraylist.

    You are given n lines. In each line there are zero or more integers.
    You need to answer a few queries where you need to tell the number located in y-th position of x-th line.

    Take your input from System.in.

    Input Format
    The first line has an integer n .
    In each of the next n lines there will be an integer  d denoting number of integers on that line
    and then there will be d space-separated integers.
    In the next line there will be an integer q denoting number of queries.
    Each query will consist of two integers x and y.


    Output Format
    In each line, output the number located in  position of  line. If there is no such position, just print "ERROR!"

    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of Lines - n: ");
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for (int i=0; i<n;i++){
            System.out.println("Number of elements in line : "+ (i+1));
            int d = sc.nextInt();
            ArrayList<Integer> newArr = new ArrayList<>();
            System.out.println("Please enter the elements present in this line: ");
            for(int j=0;j<d;j++){
                newArr.add(sc.nextInt());
            }
            arr.add(newArr);
        }

        System.out.println("enter number of queries : ");
        int q = sc.nextInt();
        ArrayList<ArrayList<Integer>> queryList = new ArrayList<>();
        for(int i=0; i<q;i++){
            System.out.println("Please enter values for query : " + (i+1));
            ArrayList<Integer> qr = new ArrayList<>();
            System.out.println("First value = Line Number");
            System.out.println("Second Value = Index Number");
            for(int j=0; j<2;j++){
                System.out.println("Value "+ (j+1) + " : " );
                qr.add(sc.nextInt());
            }
            queryList.add(qr);
        }
        sc.close();

        for(int i=0;i<q;i++){
            ArrayList<Integer>innerList=queryList.get(i);
            int line=innerList.get(0)-1;
            int index=innerList.get(1)-1;

            ArrayList<Integer>outerList=arr.get(line);
            try
            {int element = outerList.get(index);
                System.out.println(element);}
            catch(Exception e){
                System.out.println("ERROR!");
            }

        }

    }
}
