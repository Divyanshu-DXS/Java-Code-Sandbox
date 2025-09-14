package GeneralProgrammingAndConcepts.ClassesNObjects;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class StudentMain {


    public static void main(String[] args)
            throws ClassNotFoundException, IllegalAccessException,
            InstantiationException, NoSuchMethodException, InvocationTargetException {
        Student obj = new Student();
        obj.name="Divyanshu";
        obj.rollNo="B100010102";
        obj.marks1=100;
        obj.marks2=99;
        obj.marks3=100;

        obj.display();
        System.out.println("Grade is: "+obj.getGrade());
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println(obj.random);
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

        // 5 Different ways to create an object
        // # 1
        // Using the new keyword
        Student s1 = new Student();
        System.out.println("Reference for object S1: "+ s1);

        // # 2
        // Using the Class 'class' to create an object by making use of method newInstance()
        // Method one - Class 'class' is available in java.lang package.
        // important - while providing the class name in java, you have to refer to its absolute path within the project folder
        Student s2 = (Student) Class.forName("GeneralProgrammingAndConcepts.ClassesNObjects.Student").newInstance();
        System.out.println("Reference for object S2: "+ s2);
        // On a similar context the class can also be loaded as below :
        Student s3 =Student.class.newInstance();
        System.out.println("Reference fot object s3: "+ s3);

        // # 3
        // Using Constructor class newInstance method.
        Constructor<Student> s4Constr = Student.class.getConstructor();
        Student s4 = s4Constr.newInstance();
        System.out.println("Reference for object s4: "+s4);
        // newInstance () also exists in class 'Class' as it does in 'Constructor' class
        // When an object is created using the 'Class' class new instance method it internally calls for the 'Constructor' class newInstance method
        //
        // Difference between the newInstance methods in Class class and Constructor class
        /* 1. The method when called from Constructor class can work with parameterized constructors
        * while the Class class method only works with 'public and default' constructors
        * 2. The Class class newInstance method only works with constructors that are visible.
        * However, the constructor class newInstance method can also work with private contructors in certain scenarios.
        * 3. When Class class newInstance invokes a constructor and throws an exception (checked or unchecked) will throw all the exceptions.
        * However, if the exception is thrown by Constructor class it throws only a single exception - InvocationTargetException
        */

    }
}


