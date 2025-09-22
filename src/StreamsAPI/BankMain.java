package StreamsAPI;

import ExceptionHandling.CustomException.BankExample.Bank;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class BankMain {
    public static void main(String[] args) {
        BankCustomer dev = new BankCustomer("Dev","100102",5031499.99,001,22);
        BankCustomer dxs = new BankCustomer("DXS","100104",100499.99,002,25);
        BankCustomer sid = new BankCustomer("Sid","100103",2031499.99,003,19);
        BankCustomer sam = new BankCustomer("Sam","100101",8031499.99,001,30);
        BankCustomer rags = new BankCustomer("Rags","100112",6631499.99,002,28);
        BankCustomer surs = new BankCustomer("Surs","100120",931499.99,001,27);

        List<BankCustomer> customerObjects = Arrays.asList(dev,dxs,sid,sam,rags,surs);
        // using streams to print these objects
        customerObjects.stream().forEach(s-> System.out.println(s));

        System.out.println("*****************");
        // sort the objects based on their bank account balance and display sorted list
        customerObjects.stream().sorted(Comparator.comparing(BankCustomer::getBalance)).forEach(s-> System.out.println(s));

        System.out.println("*****************");
        // printing the customer with highest balance
        System.out.println("Customer with highest balance is : "+customerObjects.stream().max(Comparator.comparing(BankCustomer::getBalance)));

        System.out.println("*****************");
        // printing the customer with lowest balance
        System.out.println("Customer with lowest balance is : "+customerObjects.stream().min(Comparator.comparing(BankCustomer::getBalance)));

        System.out.println("*****************");
        System.out.println("Printing list of first 2 customer names whose age is > 25");
        // print name of first 2 customers whose age is > 25
        customerObjects.stream().filter(customerObject -> customerObject.getAge()>25).limit(2).forEach(n-> System.out.println(n.getName()));
    }
}
