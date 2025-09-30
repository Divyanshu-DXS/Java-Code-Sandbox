package StreamsAPI.Student;

import java.util.Objects;

public class Student {

    String name;
    int rollNo;
    String course;
    String grade;

    public Student(String name, int rollNo, String course, String grade) {
        this.name = name;
        this.rollNo = rollNo;
        this.course = course;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", course='" + course + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Student student = (Student) o;
//        return Objects.equals(name, student.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name);
//    }
}
