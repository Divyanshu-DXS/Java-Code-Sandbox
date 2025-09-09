package FunctionalInterfaces_and_Lambdas.BasicExamples;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class RunClass {
    public static void main(String[] args) {

        // using anonymous class method
        /* if not anonymous class, we had to create another new class that would have implemented the abstract method.
        * and then an object of that method would have been created to reference the unimplemented method and function
        * Anonymous class helps us omit that extra work and define it directly like below
        * */
        LearningInterfaceFunc obj = new LearningInterfaceFunc() {
            @Override
            public String getSubject(String subject, int hours) {
                return subject;
            }
        };
        System.out.println(obj.getSubject("Java Lambda",12));

        // combing anonymous method with lambdas helps us shorten the syntax even more.
        // The difference is HUGE → less boilerplate, more expressive code.

        LearningInterfaceFunc lamdaObj = (subject, hours) ->{
            subject="Subject : " + subject+" studied for"+hours;
            return subject;
        } ;
        System.out.println(lamdaObj.getSubject("JavaLambdas",4));

        // trying out with the LambdaTrialExample interface
        // Since there is just one parameter in the method, and one statement no {} are needed
        LambdaTrialExample newObj = (subject)-> "Studying : "+subject;
        System.out.println(newObj.study("Lambdas"));

        // Trying out the greeter interface
        // 1. With anonymous class
        Greeter greeterObj = new Greeter() {
            @Override
            public String greet(String msg) {
                return msg;
            }
        };
        System.out.println(greeterObj.greet("Hello world"));

        // 2. With Lambdas
        Greeter greeterObj2 = (msg) -> msg;
        System.out.println(greeterObj2.greet("Hello World this is Lambdas"));

        // Built in functional interfaces
        // PREDICATE - Write a Predicate<String> to check if a string starts with "A"
        Predicate<String> checkChar = c -> c.charAt(0)=='A';
        System.out.println(checkChar.test("Alpha"));
        // FUNCTION - Write a Function<Integer, String> to convert an integer to "Number: x".
        Function<Integer,String> convertIntString = (x)->"Number :"+x;
        System.out.println(convertIntString.apply(101));
        // CONSUMER - Write a Consumer<String> that prints a string in uppercase.
        Consumer<String> convertUpperCase =(str)->{
            System.out.println(str.toUpperCase());
        };
        convertUpperCase.accept("ChAngE me AlL tO UPPEr CaSE");
        // SUPPLIER - Write a Supplier<String> that returns today’s date as a string.
        Supplier<String> todaysDate =()-> LocalDate.now().format(DateTimeFormatter.ISO_DATE);
        System.out.println("Todays Date : "+todaysDate.get());


    }
}
