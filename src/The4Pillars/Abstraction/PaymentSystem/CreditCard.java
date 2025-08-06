package Abstraction.PaymentSystem;

public class CreditCard extends PaymentSys{

    double balance;
    double amm;
    public CreditCard(double amm) {
        // default ammount set if object initiated with a defined ammount. 
            this.amm=amm;
            balance=amm;
            //TODO Auto-generated constructor stub
        }

    public double getBalance() {    
        return balance;
    }
    
        @Override
    void validate() {
        
        System.out.println("Payment validated for the Credit Card ending with ****");
    }

    @Override
    void processPayment(double amm) {

        balance+=amm;
        System.out.println("Payment Processed for Credit Card ending with **** for an ammount of : "+amm);
        System.out.println("New Balance of the account is : "+balance);
        
        
    }

    
}