package GeneralProgrammingAndConcepts.ClassesNObjects;

public class StudentMain {


    public static void main(String[] args) {
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

    }
}


