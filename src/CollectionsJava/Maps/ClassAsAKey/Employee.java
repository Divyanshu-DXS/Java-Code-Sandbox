package CollectionsJava.Maps.ClassAsAKey;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class Employee {

    // Making class immutable

    // the class has also been made final, considering that this class then can not be extended by any other class
    // If it could be extended, and any modification made to that class could then also impact the object for this class

    // Removed all setter methods
    // changed all data members to final

    private final String name;
    private final int id;
    private final String dept;
    private final List<String> techStack;

    public Employee(String name, int id, String dept, List<String> techStack) {
        this.name = name;
        this.id = id;
        this.dept = dept;
        this.techStack = techStack;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getDept() {
        return dept;
    }

    //modified this to return a cloned object instead and not the original object to maintain immutability of objects returned and hashcode
    public List<String> getTechStack() {
        return new ArrayList<>(techStack);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", dept='" + dept + '\'' +
                ", techStack=" + techStack +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&
                Objects.equals(name, employee.name) &&
                Objects.equals(dept, employee.dept) &&
                Objects.equals(techStack, employee.techStack);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, dept, techStack);
    }
}
