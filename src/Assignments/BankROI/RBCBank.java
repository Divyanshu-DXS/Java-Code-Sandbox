package Assignments.BankROI;

public class RBCBank extends BankOfCanada {

    double internalRate = 1.15;

    @Override
    public double rateOfInterest() {
        // TODO Auto-generated method stub
        return super.rateOfInterest() + internalRate;
    }
}
