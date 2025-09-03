package GeneralProgrammingAndConcepts.ComparableExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        List<Student> studentObj = new ArrayList<>();
        studentObj.add(new Student("Krsna",101));
        studentObj.add(new Student("Calm",102));
        studentObj.add(new Student("Encore",110));
        studentObj.add(new Student("Divine",112));
        studentObj.add(new Student("Dino",119));
        studentObj.add(new Student("BrodaV",121));

        System.out.println(studentObj);

        Collections.sort(studentObj);

        System.out.println("Sorted");
        System.out.println(studentObj);

    }
}
