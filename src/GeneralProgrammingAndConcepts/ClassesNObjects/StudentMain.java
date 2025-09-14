package GeneralProgrammingAndConcepts.ClassesNObjects;

public class StudentMain {


    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
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
        // Using the new keyword
        Student s1 = new Student();
        System.out.println("Reference for object S1: "+ s1);

        // Using the Class 'class' to create an object by making use of method newInstance()
        // Method one - Class 'class' is available in java.lang package.
        // important - while providing the class name in java, you have to refer to its absolute path within the project folder
        Student s2 = (Student) Class.forName("GeneralProgrammingAndConcepts.ClassesNObjects.Student").newInstance();
        System.out.println("Reference for object S2: "+ s2);

        // Method 3 to creat ean object uysing the object class method

        // Difference between the creation of objects in these different methods


    }
}


