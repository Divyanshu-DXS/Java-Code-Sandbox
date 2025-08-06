package Abstraction.PaymentSystem;

public class PayPal extends PaymentSys{

    double balance;
    double amm;
    public PayPal(double amm) {
        this.amm=amm;
            balance=amm;
      
    }

    @Override
void validate() {
    System.out.println("Payment validated for the PayPal account ending with ****");
}

public double getBalance() {    
    return balance;
}

@Override
void processPayment(double amm) {
    balance+=amm;
        System.out.println("Payment Processed for PayPal account ending with **** for an ammount of : "+amm);
        System.out.println("New Balance of the account is : "+balance);
    
}
}
