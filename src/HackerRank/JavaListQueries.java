package HackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* PROBLEM STATEMENT
 Given a list of N integers, perform Q queries on the list. 
 Once all queries are completed, print the modified list as a single line of space-separated integers.

Input Format

The first line contains an integer, N (the initial number of elements in list).
The second line contains N space-separated integers describing .
The third line contains an integer, Q (the number of queries).
The  subsequent lines describe the queries, and each query is described over two lines:

If the first line of a query contains the String 'Insert', 
then the second line contains two space separated integers , and the value  must be inserted into  at index .

If the first line of a query contains the String 'Delete', 
then the second line contains index , whose element must be deleted from .
 */

public class JavaListQueries {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //size of the list to be defined
        List<Integer>list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt()); // adding elements to the list
        }
        int q = sc.nextInt(); //number of queries
        sc.nextLine();
        while(q>0){
            String s = sc.nextLine();
            if(s.contentEquals("Insert"))
            {
                int index= sc.nextInt();
                int val=sc.nextInt();
                list.add(index, val);
                q--;
            }
            if(s.contentEquals("Delete")){
                int index=sc.nextInt();
                list.remove(index);
                q--;
            }
        }
        for(Integer i : list){
            System.out.print(i+" ");
        }
        sc.close();
    }
}
