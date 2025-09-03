package GeneralProgrammingAndConcepts.ComparatorExample;

import java.util.Comparator;

public class Student {

    String name;
    int roll;
    int rank;

    public Student(String name, int roll, int rank) {
        this.name = name;
        this.roll = roll;
        this.rank =rank;

    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", roll=" + roll + '\'' +
                ", rank=" + rank +
                '}';
    }


}
