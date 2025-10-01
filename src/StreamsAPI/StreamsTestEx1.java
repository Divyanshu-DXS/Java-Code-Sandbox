package StreamsAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamsTestEx1 {
    public static void main(String[] args) {

//        Supplier<String> supplier = ()->"Hello Streams";
//        // Stream creates a pipeline that keeps generating data that needs to be operated upon - an infinite stream
//        // Stream object takes a supplier object as an argument that supplies the data
//        Stream<String> streamOfStrings = Stream.generate(supplier);
//
//        Consumer<String> consumer=s -> System.out.println(s);
//        // Using forEach here we are accepting the stream of data and keep asking the pipeline if there is any more data to offer.
//        // the forEach method here takes  a Consumer object as an argument, that consumes the data supplied by the Stream object.
//        streamOfStrings.forEach(consumer);
//        // This in result will give us a stream of infinite Strings -"Hello Streams".

//        // Using lambdas to shorten and work on this code above
//        // THis code runs infinite loop, so keeping this commented out
//        Stream.generate(()->"Hello Stream!!").forEach(s-> System.out.println(s));

        // the generate function provides us with an infinite stream, we also have a method 'of()' that provides us with a finite stream to work on

//        Consumer<Integer> consumer = i -> System.out.println(i);
//        Stream<Integer> streamOfIntegers = Stream.of(1,2,4,5,6,126,613,61,46,84,48,36,8,9464,2,784);
//        streamOfIntegers.forEach(consumer);

        // lets try to use lambda and then shorten this code above
        Stream.of(1,2,4,5,6,126,613,61,46,84,48,36,8,9464,2,784).forEach(i -> System.out.println(i));

        System.out.println("*******************");

        // trying to print out a stream of strings using lambdas and streams
        Stream.of("Krsna","Divine","Karma","Kahlon","Dino","Em","Raftaar").forEach(s -> System.out.println(s));

        System.out.println("*******************");

        // Trying to use filter with it.
        // Filter takes a predicate object (returns boolean) to operate and verify a statement that can help filter the stream.
        Stream.of("Krsna","Divine","Karma","Kahlon","Dino","Em","Raftaar").filter(s -> s.length()>5).forEach(s -> System.out.println(s));

        System.out.println("*******************");

        // using count()
        System.out.println(Stream.of("Krsna", "Divine", "Karma", "Kahlon", "Dino", "Em", "Raftaar").count());

        System.out.println("*******************");

        // findFirst()
        System.out.println(Stream.of("Krsna", "Divine", "Karma", "Kahlon", "Dino", "Em", "Raftaar").findFirst());

        System.out.println("*******************");

        // Using sorted ()
        Stream.of("Krsna", "Divine", "Karma", "Kahlon", "Dino", "Em", "Raftaar").sorted(Comparator.naturalOrder()).forEach(s -> System.out.println(s));

        System.out.println("*******************");

        // Using map
        // We will use a new collection of numbers and will use map to print respective string representation of them.
        // for instance 1-"one" 2-"two" 3-"three" , etc.

        List<Integer> numbers = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10,11,12));
        numbers.stream().filter(n->n%2==0).map((n)->{
            System.out.println("Operating on number : "+ n);
            switch (n){
                case 1 : return "One";
                case 2 : return "Two";
                case 3 : return "Three";
                case 4 : return "Four";
                case 5 : return "Five";
                case 6 : return "Six";
                case 7 : return "Seven";
                case 8 : return "Eight";
                case 9 : return "Nine";
                case 10 : return "Ten";
            }
           return "Number not available";
        }).forEach(n-> System.out.println(n));

        System.out.println("*******************");

        // this will go on generating an infinite stream of data, starting from 0(seed)
        // Iterate method here takes, a seed(initial value), and a unary operator
        // Unary operator is a special implementation of the 'Function' functional interface that takes an argument of one type and returns same type
        // Commenting this out to save infinite operations from running but building up on same, with more methods implementations below
//        Stream.iterate(0,n->n+1).forEach(n-> System.out.println(n));

        // using takeWhile() of Streams API.
        // Similar to filter method it also takes a Predicate object, and filters the content.
        // but takeWhile short-circuits the infinite stream where the condition is met and stops it there.
        Stream.iterate(0,n->n+1)
                .takeWhile(n->n<20)
                .forEach(n-> System.out.println(n));
        System.out.println("*******************");

        // Comparing filter() and takeWhile()
        // You can observe here how filter works on all the data in the stream, whereas takeWhile terminates the moment the condition specified in it fails
        System.out.println("Comparing takeWhile() and the filter()");
        //takeWhile()
        System.out.println("Running takeWhile()");
        Stream.of("Dev","Div","Krsna","Dino","Raftaar","Skahlon","Karma","BrodaV","Em","50","Dre")
                .takeWhile(n->n.length()<6)
                .forEach(n-> System.out.println(n));

        System.out.println();

        //filter()
        System.out.println("Running filter()");
        Stream.of("Dev","Div","Krsna","Dino","Raftaar","Skahlon","Karma","BrodaV","Em","50","Dre")
                .filter(n->n.length()<6)
                .forEach(n-> System.out.println(n));

        System.out.println("*******************");

        //peek()
        Stream.of("Dev","Div","Krsna","Dino","Raftaar","Skahlon","Karma","BrodaV","Em","50","Dre")
                .peek(n-> System.out.println("current Object is : " + n))
                .forEach(n-> System.out.println(n));

        System.out.println("*******************");

        //sorted() -- stateful function
        //observe how it will record all the objects first and then they are together released for peek and foreach
        Stream.of("Dev","Div","Krsna","Dino","Raftaar","Skahlon","Karma","BrodaV","Em","50","Dre")
                .filter(n->{
                    System.out.println("Inside filter method .. filtering object : " + n);
                    return n.length()<6;
                }) // observer here how filter actually goes through all the streamed data but all of that is not passed on to the next method in pipeline
                .sorted()
                .peek(n-> System.out.println("Sorting done .. cuurent object is : "+ n))
                .forEach(n-> System.out.println(n));

        // reduce ()
        System.out.println("*******************");
        System.out.println("Working on reduce : ");
        System.out.println(Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 22, 33, 44, 55, 66, 77, 88, 99, 101, 102, 103, 104, 105, 106, 107, 108, 109)
                .filter(n -> n % 2 == 0)
                .reduce(0, (a, b) -> {
                    System.out.println("a = " + a);
                    System.out.println("b = " + b);
                    return a + b;}));

        // flatmap ()
        // flatmap can help you work if you have a collection of a collection of objects
        // for this example we would be working on a collection of Employee objects
        // Employee object further contains a collection of String email address
        // we will try and access that
        Employee e1 = new Employee("Adam",1001,new ArrayList<String>(List.of("Adam.a@gmail.com","A.adam@gmail.com","Adam1@gmail.com")));
        Employee e2 = new Employee("Ben",1002,new ArrayList<String>(List.of("Ben.a@gmail.com","A.ben@gmail.com","Benny@gmail.com")));
        Employee e3 = new Employee("Brock",1003,new ArrayList<String>(List.of("Brock.a@gmail.com","A.brock@gmail.com","lesnar@gmail.com")));
        Employee e4 = new Employee("Dev",1004,new ArrayList<String>(List.of("Dev.a@gmail.com","Devendre.adam@gmail.com","Dave@gmail.com")));

        System.out.println("*******************");
        List<Employee> employeeList = new ArrayList<Employee>(List.of(e1,e2,e3,e4));
        System.out.println("employee list currently has : " + employeeList);
        System.out.println("printing only email address from the employee list : ");
        employeeList.stream()
                .flatMap(n->n.getEmail().stream()) // this now returns the String objects from the getEmail() of Employee objects
                .forEach(System.out::println);


    }
}
