package UserInputScannerClass;

import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userInput;
        System.out.println("Enter an integer user Input: ");
        userInput=sc.nextInt();
        System.out.println("User selection is: " + userInput);
        sc.close();
    }
}
