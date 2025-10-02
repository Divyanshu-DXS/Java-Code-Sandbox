package Optionals;

import javax.swing.text.html.Option;
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

        System.out.println("********************");
        System.out.println("CREATING OPTIONAL OBJECTS >>>> ");
        // Creating option objects -- we can use either of the approaches below, in relation to what we might think the option would hols
        // 1. empty() To create an empty Optional object
        Optional<String> optEmpty = Optional.empty();
        // 2. .of() we can also create an optional object using this >> but the value passed in this cannot be null
        Optional<String> optOf = Optional.of("DEV");
        // 3. ofNullable() in case we expect some null values
        Optional<String> optOfNullable = Optional.ofNullable(null);
        System.out.println(".empty() - " + optEmpty);
        System.out.println(".of() - " + optOf);
        System.out.println(".ofNullable() - " + optOfNullable);

        System.out.println("********************");
        System.out.println("Checking Values present : isEmpty() & isPresent()");
        // isPresent() : we can check if there is a value in the optional object or not with the isPresent() method
        System.out.println("case : isPresent ()");
        System.out.println(optEmpty.isPresent()); // returns false
        System.out.println(optOf.isPresent()); // returns true since it actually holds an object in it
        // isEmpty() : is just the opposite of isPresent() as this checks if the optoinal is empty
        System.out.println("case : isEmpty ()");
        System.out.println(optEmpty.isEmpty()); // returns true
        System.out.println(optOf.isEmpty()); // returns false since it actually holds an object in it

        System.out.println("********************");
        System.out.println("Conditional Actions with ifPresent() : ");
        // ifPresent()
        // ifPresent() take a Consumer object
        // lets try to pass in a consumer lambda and check how this operates
        // on the optOf optional where there is an object present in the box
        optOf.ifPresent(n-> System.out.println(n.length()));
        // on the optOfnullable where there is null in the box
        optOfNullable.ifPresent(n-> System.out.println(n.length())); //does not give any output since the object in optional was a null

        System.out.println("********************");
        System.out.println("Default value with orElse() : ");
        // orElse() : used to retrieve the value wrapped inside an Optional instance. It takes one parameter, which acts as a default value.
        // The orElse() method returns the wrapped value if it’s present, and its argument otherwise:
        String nullValue = null;
        // In this case this will setup a value for str1 = value stored in nullValue object and if the value in it is null,
        // it stores the value that is passed as a parameter to the orElse()
        String str1 = Optional.ofNullable(nullValue).orElse("DXS");
        System.out.println(str1); // hence returns DXS

        System.out.println("********************");
        System.out.println("Default value with orElseGet() : ");
        // orElseGet() :similar to orElse(). However, instead of taking a value to return if the Optional value is not present,
        // it takes a supplier functional interface, which is invoked and returns the value of the invocation:
        String str2 = Optional.ofNullable(nullValue).orElseGet(()->"KRSNA");
        System.out.println(str2);

        System.out.println("********************");
        System.out.println("Exceptions With orElseThrow()");
        // Exceptions With orElseThrow()
        // Following in order of orElseGet() & orElse() this is another apporach to handle null values where it can than throw an exception
        String str3 = Optional.ofNullable(nullValue).orElseThrow(()->new IllegalArgumentException()); // This one would throw the specified exception
        String str4 = Optional.ofNullable(nullValue).orElseThrow(); // This one with an empty argument throws no such element exception 




    }

    // The purpose of the class is to provide a type-level solution for representing optional values instead of null references.

    public static Optional<String> getNumber(int x){

       Optional<String> str = Optional.of("Ram");
        return str;
    }
}
