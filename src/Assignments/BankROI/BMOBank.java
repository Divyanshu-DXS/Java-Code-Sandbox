package Assignments.BankROI;

public class BMOBank extends BankOfCanada {

    double internalRate = 1.50;

    @Override
    public double rateOfInterest() {
        // TODO Auto-generated method stub
        return super.rateOfInterest() + internalRate;
    }
}
