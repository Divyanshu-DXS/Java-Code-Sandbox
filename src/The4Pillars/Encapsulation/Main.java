package Encapsulation;

public class Main {
    public static void main(String[] args) {
        StudentEncapsulatoin ob = new StudentEncapsulatoin();
        // ob.name = "Dev"; -- this gives an error as the name variable has been setup as private. 
        // System.out.println(ob.name); -- this would not work either because of the private access modifier on name variable
        // this is encapsulaton. We use the setter and getter methods to update and view the data

        ob.setName("Dev"); // Set method to set name 
        System.out.println("Name of the student is: "+ob.getName()); // get method to get the name
    }
}
