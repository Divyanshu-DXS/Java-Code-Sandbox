package Abstraction.PaymentSystem;

public class DebitCard extends PaymentSys{

    double balance;
    double amm;
    public DebitCard(double amm) {
        this.amm=amm;
        balance=amm;
            
        }
    
        @Override
    void validate() {
        System.out.println("Payment validated for the Debit Card ending with ****");
    }

    public double getBalance() {    
        return balance;
    }

    @Override
    void processPayment(double amm) {
        balance+=amm;
        System.out.println("Payment Processed for Debit Card ending with **** for an ammount of : "+amm);
        System.out.println("New Balance of the account is : "+balance);
       
    }
    
}
