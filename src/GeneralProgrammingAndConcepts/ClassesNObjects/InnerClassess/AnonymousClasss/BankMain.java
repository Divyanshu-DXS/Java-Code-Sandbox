package GeneralProgrammingAndConcepts.ClassesNObjects.InnerClassess.AnonymousClasss;

public class BankMain {
    // in a general context we would have had created another class that implements the bank interface
    // that class can then be called in here and the object can be used to reference the methods in it.
    // with anonymous inner classes we can instead create a class that directly where we are creating the object and implement the method in it.
    public static void main(String[] args) {

        // Anonymous class for the bank interface
        BankInterface bank  = new BankInterface() {
            @Override
            public void displayinfo() {
                System.out.println("This is being called from within the anonymous class created that implements the interface");
            }
        };

        bank.displayinfo();

        // Anonymous class for Bank Abstract Class
        BankAbstractClass bAbs = new BankAbstractClass() {
            @Override
            void showInfo() {
                System.out.println("Bank Abstract Class - show info method");
            }

            @Override
            void accbalance() {
                System.out.println("Bank Abstract Class - acc balance method ");
            }
        };

        bAbs.showInfo();
        bAbs.accbalance();
        bAbs.accountInfo();
    }
}
