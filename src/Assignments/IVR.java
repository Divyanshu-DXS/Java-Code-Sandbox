package Assignments;
/* Working on the IVR assignement
 * My basic IVR Flow should be as below : 
XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
[Main Menu]
"Welcome to XYZ Customer Support"
Press 1 for English  
Press 2 for French  
Press 0 to Exit  

-------------------------

[If 1 is selected - English Menu]
"You have selected English. Please choose from the following options:"
Press 1 for Billing Department  
Press 2 for Technical Support  
Press 3 for Retailer Queries  
Press 4 for Product Team  
Press 9 to go back to Main Menu  
Press 0 to Exit  

-------------------------

[If 2 is selected - French Menu]
"You have selected Fench. We have limited support, unfortunately. Please choose from the following options:"
Press 1 for Transfer to French Line --> Transfer SYSOUT and then exit 
Press 2 for Request CallBack  
Press 3 for Request French Call Line Call Back numbet 
Press 9 to go back to Main Menu  
Press 0 to Exit  

-------------------------

[Handling Other Selections]
Any invalid input should prompt:  
"Invalid selection. Please try again."  
Then re-display the current menu.

-------------------------

Pressing 0 to Exit [Exit]
"Thank you for calling XYZ Customer Support. Goodbye!"
 */

import java.util.Scanner;
public class IVR {
 
    public static void main(String[] args) {
     
        System.out.println("WELCOME TO DXS CUSTOMER SUPPORT!");
        System.out.println("XXXXXXXXXX - - XXXXXXXXXX");
        Scanner sc = new Scanner(System.in);
       
        boolean sessionActive = true;

        while(sessionActive){
            System.out.println("Press 1 for English");
            System.out.println("Press 2 for French");
            System.out.println("Press 0 to Exit");
            System.out.print("Your Choice: ");
            int customerInput = sc.nextInt();

            if(customerInput==0){
                System.out.println("Thank you for calling DXS Customer Support. Goodbye!");
                break;
            }

            switch(customerInput){
                case 1: 
                while(true){

                System.out.println("You have selected English. Please choose from the following options:");
                System.out.println("1. Billing Department");
                System.out.println("2. Technical Support");
                System.out.println("3. Retailer Queries");
                System.out.println("4. Product Team");
                System.out.println("9. Go back to Main Menu");
                System.out.println("0. Exit");
                System.out.println();
                System.out.print("Please enter your selection: ");

                        int engChoice = sc.nextInt();
                         switch(engChoice){
                            case 1:
                            System.out.println("You have reached the Billing Department.");
                            break; 
                            case 2:
                            System.out.println("You have reached Technical Support.");
                            break; 
                            case 3:
                            System.out.println("You have reached Retail Queries.");
                            break; 
                            case 4:
                            System.out.println("You have reached the Product Team.");
                            break; 
                            case 9:
                            break; // this should break us to main menu. condition might be met outside switch here.
                            case 0:
                            System.out.println("Thank you for calling DXS Customer Support. Goodbye!");
                                System.exit(0);
                            break; 
                            default:
                            System.out.println("Invalid selection. Please try again.");
                            System.out.println("XXXXXXXXXX - - XXXXXXXXXX");
                         }
                         if (engChoice == 9)break;
                        }
                break;
                        
                case 2:
                while(true){
                    
                    System.out.println("You have selected French. We have limited support, unfortunately. Please choose from the following options:");
                    System.out.println("1. Transfer to French Line");
                    System.out.println("2. Request a CallBack");
                    System.out.println("3. Request French Line Number");
                    System.out.println("9. Go back to Main Menu");
                    System.out.println("0. Exit");
                    System.out.println();
                    System.out.print("Please enter your selection: ");
    
                            int frChoice = sc.nextInt();
                             switch(frChoice){
                                case 1:
                                System.out.println("You have reached the French Support Line, kindly hold.");
                                break; 
                                case 2:
                                System.out.println("To request a CallBack kindly help us with your name and phonenumber");
                                System.out.println("Please enter your name: ");
                                String custName = sc.next();
                                System.out.println("Please enter a callback phone number");
                                String phoneNum = sc.next();
                                System.out.println("Thank you " + custName + ". Your callback request has been recorded. You should expect a callback on "+phoneNum + " in next 24-48 hours.");
                                break; 
                                case 3:
                                System.out.println("You can reach the French support line on - 222 222222222");
                                break; 
                                case 9:
                                break; // this should break us to main menu. conditoin might be met outside switch here.
                                case 0:
                                System.out.println("Thank you for calling DXS Customer Support. Goodbye!");
                                    System.exit(0);
                                break; 
                                default:
                                System.out.println("Invalid selection. Please try again.");
                                System.out.println("XXXXXXXXXX - - XXXXXXXXXX");
                             }
                             if (frChoice == 9)break;
                            }
                break;


                case 0:
                break;


                default:
                System.out.println("Invalid selection. Please try again.");
            }
        }
        sc.close();
    }
}
