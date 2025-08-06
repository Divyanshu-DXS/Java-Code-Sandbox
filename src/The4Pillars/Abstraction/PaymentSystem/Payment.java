package Abstraction.PaymentSystem;

public class Payment {
    public static void main(String[] args) {
     
        System.out.println("PAYMENT SYSTEM");
        System.out.println();
        PaymentSys cc = new CreditCard(1000.01);
        PaymentSys dc = new DebitCard(99999.99);
        PaymentSys pp = new PayPal(1999999.12);

        System.out.println("CREDIT CARD");
        System.out.println("Credit Card Original Balance : "+ cc.getBalance());
        cc.validate(); cc.processPayment(1235); System.out.println(cc.getBalance());
        System.out.println();
        System.out.println("Debit Card Original Balance : "+ dc.getBalance());
        System.out.println("DEBIT CARD");
        dc.validate(); dc.processPayment(10000); System.out.println(dc.getBalance());
        System.out.println();
        System.out.println("PayPal Original Balance : "+ pp.getBalance());
        System.out.println("PAYPAL");
        pp.validate();pp.processPayment(121345); System.out.println(pp.getBalance());


    }
}
