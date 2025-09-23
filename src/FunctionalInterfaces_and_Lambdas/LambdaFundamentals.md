# Lambda Fundamentals 

## Funtional Interface 

This is an interface with exactly one abstract method. There can be more default or static methods in it but precisely one abstract method. 

### Built-In Java Functional Interfaces

Since Java SE 1.8 onwards, there are many interfaces that are converted into functional interfaces. 
All these interfaces are annotated with @FunctionalInterface. These interfaces are as follows:

- Runnable: This interface only contains the run() method.
- Comparable: This interface only contains the compareTo() method.
- ActionListener: This interface only contains the actionPerformed() method.
- Callable: This interface only contains the call() method.

###Types of Functional Interfaces in Java

Java SE 8 included four main kinds of functional interfaces which can be applied in multiple situations as mentioned below:
   
- Consumer<T>   :   takes T, returns nothing (void).
- Predicate<T>  :   takes T, returns boolean.
- Function<T,R> :   takes T, returns R 
- Supplier<T>   :   takes nothing, returns T
- Bi-Functional Interfaces :  
-> BiPredicate<T, U> → takes two args, returns boolean.<br>
-> BiFunction<T, U, R> → takes two args, returns result.<br>
-> BiConsumer<T, U> → takes two args, returns nothing.<br>

                              
                              

## Lambdas 

A lambda expression is a short block of code which takes in parameters and returns a value. 
Lambda expressions are similar to methods, but they do not need a name and they can be implemented right in the body of a method.


## Writing Lambdas has a few set of rules or building blocks: 
1. Supports only functional interface
2. You do not need variable types
3. you can rename variables 
4. you dont need parenthesis if the function has a single argument
5. if you have a single line of code you do not need {} or the return keyword  

## More important points in lambda's context

- Lambdas can not use local variables, but can use instance variables
- Reason being local variables are allocated in stack memory and lambdas do not operate on stack memories 
- We can also make use of atomic memory in this case by using an atomic reference
    - <Code>AtomicReference\<Integer> count = new AtomicReference<>();
</code>
