package com.dev.dxs.MavenProjectDemo1;

public class Employee {
    String fName;
    String lName;
    Profession role;

    public Employee(String fName, String lName, Profession role) {
        this.fName = fName;
        this.lName = lName;
        this.role =role;
        System.out.println("Calling Argument Contructor .... ");
    }

    public void setRole(Profession role) {
        this.role = role;
    }

    public Employee() {
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
        System.out.println("Setting up firsnName : " + fName);
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
        System.out.println("Setting up lastName : " + lName);
    }

    public  void  preBeanCreation(){
        System.out.println("The creatoins has been initiated .... ");
    }

    public void postLifecycleClosing(){
        System.out.println("Closing session and terminating ...");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", role=" + role +
                '}' + role.yourProfession(role.jobRole);
    }
}
