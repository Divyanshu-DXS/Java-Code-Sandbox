package StreamsAPI;

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

        // the generate function provides us with an infinite stream, we also have a method 'of()' that provides us with a finite stream to work on

        Consumer<Integer> consumer = i -> System.out.println(i);
        Stream<Integer> streamOfIntegers = Stream.of(1,2,4,5,6,126,613,61,46,84,48,36,8,9464,2,784);
        streamOfIntegers.forEach(consumer);




    }
}
