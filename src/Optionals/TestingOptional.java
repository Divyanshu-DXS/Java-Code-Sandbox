package Optionals;

import java.util.Optional;

public class TestingOptional {
    public static void main(String[] args) {

//        String str = getNumber(2);
//        System.out.println(str.toUpperCase()); // Currently this will throw us a null pointer exception because getNumber() returns null

        // In scenarios like, where data is being fetched from the database, or any similar kind of methods have been defined that can potentially return a null value
        // can ideally break the execution of the program and throw an exception
        // originally this used to be handled either by setting up a condition like
//        if(null!=str){
//            System.out.println(str.toUpperCase());
//            // But this approach is very raw, and does not provide efficiency, because say if there were hundereds of places where that was implementing manually handling null was not optimum
            // Hence Optional were introduced
//        }

        // lets try and use optoinals instead here and see how we can operate on these
        System.out.println("********************");

        Optional<String> optionalStr = getNumber(2);
        System.out.println("The value of the Optional String is : "+ optionalStr); // this comes as in a box - the optional object box.
        System.out.println("To get the value stored inside the optional box we make use of the get() : " + optionalStr.get()); //
        System.out.println("Lets try and implement a toUpperCase on this : ");
        System.out.println(optionalStr.get().toUpperCase());

        
    }

    // The purpose of the class is to provide a type-level solution for representing optional values instead of null references.

    public static Optional<String> getNumber(int x){

       Optional<String> str = Optional.of("Ram");
        return str;
    }
}
