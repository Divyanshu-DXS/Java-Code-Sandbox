package FunctionalInterfaces_and_Lambdas;


import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class LamdaRunner {


    public static void main(String[] args) {
        // Working on calculator interface -- multiple parameters
        // we can define lamdas below to perform different operations on the arguments provided
        // Adding
        Calculator add = (a,b) -> {return a+b;};
        // this above expression can be written without the return keyword and the {} as it only has a single expression
        // so it could have been re written as (a,b)->a+b;,
        System.out.println(add.calculate(12,10));
        // Subtracting
        Calculator subtract = (a,b) -> {return a-b;};
        System.out.println(subtract.calculate(12,3));

        // Working on Calculator2 interface where the plan is also to take input for the operation to be performed 
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the numbers on which the operation is to be performed ");
        System.out.println("Number A: ");
        double a = sc.nextInt();
        System.out.println("Number B: ");
        double b = sc.nextInt();
        sc.nextLine();
        System.out.println("Please select the operation to be performed : +,-,*,/");
        char c = sc.nextLine().charAt(0);

        Calculator2 calc2 = null;
        switch (c){
            case '+':
                calc2 =(x,y,z)->x+y;
                break;
            case '-':
                calc2 =(x,y,z)->x-y;
                break;
            case '*':
                calc2=(x,y,z)->x*y;
                break;
            case '/':
                try{
                calc2=(x,y,z)->x/y;}
                catch (ArithmeticException e){
                    System.out.println("Division by 0 not allowed");
                }
                break;
            default:
                System.out.println("Invalid entry");
                
        }
        System.out.println(calc2.calc(a, b,c));

    }

}
