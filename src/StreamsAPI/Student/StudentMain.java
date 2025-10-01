package StreamsAPI.Student;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class StudentMain {
    public static void main(String[] args) {

        Student s1 = new Student("Divyanshu",1001,"Software Arch","A");
        Student s2 = new Student("Krsna",1004,"S/W Engineering","B");
        Student s3 = new Student("SKahlon",1021,"Java","C");
        Student s4 = new Student("Dino",1321,"Python","A");
        Student s5 = new Student("Karma",1871,"Linux","C");
        Student s6 = new Student("Talha",1088,"Database Admin","B");
        Student s7 = new Student("Talha",1088,"Database Admin","B");

        List<Student> list = new ArrayList<>(List.of(s1,s2,s3,s4,s5,s6,s7));

        list.stream()
                .filter(n->n.grade=="A"||n.grade=="B")
                .forEach(stud-> System.out.println(stud));

        System.out.println("*******************");

        list.stream()
                .sorted(Comparator.comparing(Student::getRollNo))
                .sorted(Comparator.comparing(Student::getGrade))
                .forEach(n-> System.out.println(n));
        System.out.println("*******************");

        list.stream()
                .filter(n->n.course.equals("Java"))
                .forEach(n-> System.out.println(n));

        System.out.println("*******************");
        System.out.println();
        System.out.println("Lets try to modify the values of the data members of these objects here : CHANGE ALL GRADES TO A+");
        System.out.println("Original list is : " + list);

        list.stream().map(n->{
            n.setGrade("A+");
            return n;
        }).forEach(n-> System.out.println(n));

        System.out.println("Original list now has been modified : " + list);
        System.out.println("*******************");

        list.stream().filter(n->n.rollNo<1150).map(n->{n.setCourse("PROMOTED "+n.getCourse()); return n;}).forEach(n-> System.out.println(n));

        System.out.println("*******************");

        System.out.println(list);

        list.stream().distinct().forEach(n-> System.out.println(n));

        System.out.println("*******************");

        list.stream().distinct().forEach(n-> System.out.println(n));

        System.out.println("*******************");


        // lambdas of comparator
        System.out.println("Working on creating lambdas for the comparator functional interface :");
        list.sort((m,n)->m.getName().compareTo(n.getName()));
//        list.sort(Comparator.comparing(Student::getName));
        System.out.println(list);




    }
}
