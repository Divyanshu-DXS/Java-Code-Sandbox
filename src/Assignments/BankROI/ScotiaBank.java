package Assignments.BankROI;

public class ScotiaBank extends BankOfCanada {

    double internalRate = 1.25;

    @Override
    public double rateOfInterest() {
        // TODO Auto-generated method stub
        return super.rateOfInterest() + internalRate;
    }

}
