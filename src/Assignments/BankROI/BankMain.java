package Assignments.BankROI;

import java.util.Scanner;

public class BankMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        bankROICalculator(sc);

    }

    private static void bankROICalculator(Scanner sc) {
        char cont;
        boolean condition;
        do {
            System.out.println("WELCOME TO RATE OF INTEREST CALCULATOR.");
            System.out.println();
            System.out.println("SELECT BANK FROM THE LIST BELOW TO SEE THE TOTAL ROI");
            System.out.println("1. TD \n2. BMO \n3. SCOTIA \n4. RBC \n5. DXS");
            String bankName = sc.nextLine().toUpperCase();
            BankMain ob = new BankMain();
            ob.rateOfInterest(bankName);
            System.out.println("WOULD YOU LIKE TO CHECKOUT RATE OF INTEREST FOR ANOTHER BANK ? Y/N");
            cont = sc.nextLine().charAt(0);
            if (cont == 'Y' || cont == 'y') {
                condition = true;
            } else {
                condition = false;
                System.out.println("THANK YOU FOR VISITING. HAVE A NICE DAY!");
            }

        } while (condition);
    }

    public void rateOfInterest(String bankName) {
        BankOfCanada bank;

        switch (bankName) {
            case "TD":
                bank = new TDBank();
                System.out.println("Rate Of Interest Provided By " + bankName + " Is: " + bank.rateOfInterest());
                break;
            case "BMO":
                bank = new BMOBank();
                System.out.println("Rate Of Interest Provided By " + bankName + " Is: " + bank.rateOfInterest());
                break;
            case "SCOTIA":
                bank = new ScotiaBank();
                System.out.println("Rate Of Interest Provided By " + bankName + " Is: " + bank.rateOfInterest());
                break;
            case "RBC":
                bank = new RBCBank();
                System.out.println("Rate Of Interest Provided By " + bankName + " Is: " + bank.rateOfInterest());
                break;
            case "DXS":
                bank = new DXSBank();
                System.out.println("Rate Of Interest Provided By " + bankName + " Is: " + bank.rateOfInterest());
                break;
            default:
                System.out.println("INVALID INPUT \nPLEASE TRY AGAIN");
        }

    }
}
