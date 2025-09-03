package GeneralProgrammingAndConcepts.ComparatorExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Dev",1001,1));
        list.add(new Student("Adam",1011,12));
        list.add(new Student("Charlie",1013,3));
        list.add(new Student("Elenn",1021,4));
        list.add(new Student("Frank",1052,2));
        list.add(new Student("Gill",1061,7));

        System.out.println(list);
        // use comparator to do sorting here
        Collections.sort(list, new NameComparator());
        System.out.println(list);

        System.out.println("lets sort based on roll number: ");
        Collections.sort(list,new RollNoComparator());
        System.out.println(list);

        System.out.println("lets compare based on rank: ");
        // this helps us from repeatedly writing more classes and can be directly defined here in syntax
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getRank()-o2.getRank();
            }
        });
        System.out.println(list);

        // one more method using lambdas
        list.sort(Comparator.comparing(Student::getName));
        System.out.println(list);


    }
}
