package GeneralProgrammingAndConcepts.ClassesNObjects;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class StudentMain {


    public static void main(String[] args)
            throws ClassNotFoundException, IllegalAccessException,
            InstantiationException, NoSuchMethodException,
            InvocationTargetException, CloneNotSupportedException {
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
        * However, the constructor class newInstance method can also work with private constructors in certain scenarios.
        * 3. When Class class newInstance invokes a constructor and throws an exception (checked or unchecked) will throw all the exceptions.
        * However, if the exception is thrown by Constructor class it throws only a single exception - InvocationTargetException
        */

        // # 4
        // Using clone() of the Object class
        // Important - this is also an approach where the object can be created without using the constructors.
        // a cloned object but with a different reference address.
        // to make use of the clone() Student class would have to implement cloneable interface and implement its undefined methods.
        // And since clone() will clone an existing object we can make use of object - s4 for this and clone that
        // To prove lets change a value of a data member in s4 and check if that value happens to be the same for s5
        s4.name="S4 Object";
        s4.subjects=new ArrayList<String>(List.of("English","computers","Physics","History"));
        Student s5 = (Student)s4.clone();
        System.out.println("Reference for object s5: "+s5); // You would notice when this runs, the constructor does not get called.
        // reference address is also different from s4 altough s5 is cloned.
        System.out.println("S4 name value is : "+ s4.name + "\n" + "S5 name value is : "+s5.name);
        System.out.println("S4 Subject array list is : " + s4.subjects);
        System.out.println("S5 subjects array list is : "+s5.subjects);
        // experimenting : changing value of the s4 object after s5 object has been cloned from it, to see if changes reflect or not.
        s4.name="NEW S4 Object post cloning";
        System.out.println("****** S4 Name value changed post cloning to verify if changes reflect ******");
        System.out.println("S4 name value is : "+ s4.name + "\n" + "S5 name value is : "+s5.name);
        // this happened because I was reassigning s4.name to point to a new String object.
        // while s5.name still points to the old String object.
        // Lets test the same concept with the array list subjects in the Student class as well
        s4.subjects.add("Software Architecture");
        System.out.println("****** S4 Subject's ArrayList has been now changed post cloning, verifying to see if changes reflect in object s5******");
        System.out.println("S4 Subject array list is : " + s4.subjects);
        System.out.println("S5 subjects array list is : "+s5.subjects);
        // It is observed that the changes reflect in the case of arrayLists
        // What you’re seeing is shallow cloning (the default Object.clone() behavior).
        // For immutable types (like String), shallow copy is safe and fine
        // For mutable types (like arrays, lists, or custom objects) - changes in one affect the other.
        // since both objects are sharing the same underlying reference


    }
}


