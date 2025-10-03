package DesignPatterns.FactoryDesign;

public class EmployeeMain {
    public static void main(String[] args) {
        EmployeeFactory employee = new EmployeeFactory();
        Employee emp = employee.getEmployee("software");
        System.out.println(emp.salary());
    }
}
