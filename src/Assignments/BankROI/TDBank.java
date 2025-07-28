package Assignments.BankROI;

public class TDBank extends BankOfCanada {
    double internalRate = 1.12;

    @Override
    public double rateOfInterest() {
        return super.rateOfInterest() + internalRate;
    }
}
