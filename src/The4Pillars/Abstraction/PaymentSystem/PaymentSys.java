package Abstraction.PaymentSystem;

public abstract class PaymentSys {
    private double amm;
    
    // public PaymentSys(double amm) {
    //     if(amm>0)
    //     this.amm = amm;
    // }

    abstract void validate();
    abstract void processPayment(double amm);

    public double getBalance(){
        return amm;
    }

    public void setAmm(double amm) {
        this.amm = amm;
    }
}
