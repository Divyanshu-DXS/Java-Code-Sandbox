package GeneralProgrammingAndConcepts.EqualsAndHashCodeConcepts;

public class HsEqualsExampleStudent {
    String name;
    String major;

    public HsEqualsExampleStudent(String name, String major) {
        this.name = name;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "HsEqualsExampleStudent{" +
                "name='" + name + '\'' +
                ", major='" + major + '\'' +
                '}';
    }
}

