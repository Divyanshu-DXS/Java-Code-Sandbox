package CollectionsJava.Maps.ClassAsAKey;

import java.util.List;
import java.util.Objects;

public class Employee {

    // Making class immutable
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

    public List<String> getTechStack() {
        return techStack;
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
