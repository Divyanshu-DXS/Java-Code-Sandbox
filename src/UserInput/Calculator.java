package UserInput;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean wantToContinue=true;
        System.out.println("C A L C U L A T O R !!");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("You will be asked to eneter 2 numbers and select an operatoin");
        while(wantToContinue){
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("Press 1 for : Addition");
        System.out.println("Press 2 for : Subtraction");
        System.out.println("Press 3 for : Multiplication");
        System.out.println("Press 4 for : Division");
        System.out.println("Press 5 for : Modulus");
        System.out.println("Press 0 for : Exit");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("Please make your selection: " );
        int selection = sc.nextInt();
        double result;
        char cont;
        double num1, num2;

        switch(selection){
            case 1: 
            System.out.println("ENTER NUMBER 1: ");
            num1= sc.nextDouble();
            System.out.println("ENTER NUMBER 2: ");
            num2 = sc.nextDouble();
            result= num1+num2;
            System.out.println("Addition performed: "+ result);
            System.out.println("Would you like to continue: Y/N");
            cont=sc.next().charAt(0);

            if(cont=='N'||cont =='n'){
                wantToContinue=false;
            }
            break;
            case 2: 
            System.out.println("ENTER NUMBER 1: ");
            num1= sc.nextDouble();
            System.out.println("ENTER NUMBER 2: ");
            num2 = sc.nextDouble();
            result= num1-num2;
            System.out.println("Subtraction performed: "+ result);
            System.out.println("Would you like to continue: Y/N");
            cont=sc.next().charAt(0);
            if(cont=='N'||cont =='n'){
                wantToContinue=false;
            }
            break;
            case 3:
            System.out.println("ENTER NUMBER 1: ");
            num1= sc.nextDouble();
            System.out.println("ENTER NUMBER 2: ");
            num2 = sc.nextDouble();
            result= num1*num2;
            System.out.println("Multiplication performed: "+ result);
            System.out.println("Would you like to continue: Y/N");
            cont=sc.next().charAt(0);
            if(cont=='N'||cont =='n'){
                wantToContinue=false;
            }
            break;
            case 4:
            System.out.println("ENTER NUMBER 1: ");
            num1= sc.nextDouble();
            System.out.println("ENTER NUMBER 2: ");
            num2 = sc.nextDouble();
            if(num2!=0){
            result= num1/num2;
            System.out.println("Addition performed: "+ result);}
            else 
            System.out.println("Cannot divide by zero. Arithmetic Exception");
            System.out.println("Would you like to continue: Y/N");
            cont=sc.next().charAt(0);
            if(cont=='N'||cont =='n'){
                wantToContinue=false;
            }
            break;
            case 5:
            System.out.println("ENTER NUMBER 1: ");
            num1= sc.nextDouble();
            System.out.println("ENTER NUMBER 2: ");
            num2 = sc.nextDouble();
            if(num2!=0){
            result=num1%num2;
            System.out.println("Modulus performed: "+result);}
            else
            System.out.println("Arithmetic exception for dividing or moduls with 0 as denominator.");
            System.out.println("Would you like to continue: Y/N");
            cont=sc.next().charAt(0);
            if(cont=='N'||cont =='n'){
                wantToContinue=false;
            }
            break;
            default:
            System.out.println("Incorrect Selection !!");
            System.out.println("Would you like to try again: Y/N");
            cont=sc.next().charAt(0);
            if(cont=='N'||cont =='n'){
                wantToContinue=false;
                System.out.println("Thank you !! Hope you enjoyed. \nEXITING PROGRAM ...");
            } 
        }
    }
        sc.close();
    }
}
