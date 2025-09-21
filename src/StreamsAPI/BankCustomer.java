package StreamsAPI;

public class BankCustomer {
    String name;
    String accNo;
    double balance;
    int BankCode;

    public BankCustomer(String name, String accNo, double balance, int bankCode) {
        this.name = name;
        this.accNo = accNo;
        this.balance = balance;
        BankCode = bankCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getBankCode() {
        return BankCode;
    }

    public void setBankCode(int bankCode) {
        BankCode = bankCode;
    }

    @Override
    public String toString() {
        return "BankCustomer{" +
                "name='" + name + '\'' +
                ", accNo='" + accNo + '\'' +
                ", balance=" + balance +
                ", BankCode=" + BankCode +
                '}';
    }
}

