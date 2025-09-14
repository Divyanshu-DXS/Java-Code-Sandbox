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

    // In order for objects to compare using equals() and hashCode() to compare content of the objects. these methods have to be overwritten

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return  false;
        HsEqualsExampleStudent that = (HsEqualsExampleStudent) obj;
        return this.name.equals(that.name)&&this.major.equals(that.major);
    }

    @Override
    public int hashCode() {
        return name.hashCode()+major.hashCode();
    }
}

