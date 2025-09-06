package GeneralProgrammingAndConcepts.ClassesNObjects;

public class Student {
    String name;
    String  rollNo;
    int marks1,marks2,marks3;
    String random;

    public char getGrade(){
        int avg=(marks1+marks2+marks3)/3;
        System.out.println("Average marks for this student is : "+ avg);
        if (avg > 90)
            return 'A';
        else
            if(avg>=70 && avg <90)
                return'B';
            else
                return 'C';
    }
    public void display(){
        System.out.println("Student: "+name+ " RollNo.: "+rollNo+ " Has secured the following grade: "+getGrade());
    }
}
