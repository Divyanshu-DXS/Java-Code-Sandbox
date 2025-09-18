package CollectionsJava.Maps.ClassAsAKey;

import java.util.HashMap;
import java.util.Map;

public class EmployeeMain {
    public static void main(String[] args) {
        // Lets create a hashmap that will take Employee class as a key to see how it impacts and what are the things to remember'

        Map<Employee,String> empLocation = new HashMap<>();
        // adding values to the hashmap
        Employee dev = new Employee("Dev", 1010, "Development");
        Employee divine = new Employee("Divine", 1013, "Development");
        Employee jatin = new Employee("Jatin", 1042, "Management");
        Employee zakir = new Employee("Zakir", 1017, "DevOps");
        Employee bileesh =new Employee("Bileesh", 1022, "Networking");
        Employee stiby = new Employee("Stiby", 1011, "Consultant");
        empLocation.put(dev,"Waterloo");
        empLocation.put(divine,"Missisauga");
        empLocation.put(zakir,"London");
        empLocation.put(jatin,"Brampton");
        empLocation.put(bileesh,"Hyderabad");
        empLocation.put(stiby,"Vancouver");

        System.out.println(empLocation);
        // this map currently has a record of objects that we have defined above.
        // if I was to check if either of the key is equal and if they return the same value when get is used for any given key, lets try that
        System.out.println(empLocation.get(dev).equals(new Employee("Dev", 1010, "Development")));
        // this returns false because equals compares object address references unless overwritten
        // to demonstrate lets print the values we get from these operations..
        System.out.println("Value from obj 'dev' : "+ empLocation.get(dev));
        System.out.println("Value from obj 'new Employee(\"Dev\", 1010, \"Development\")' : "+ empLocation.get(new Employee("Dev", 1010, "Development")));
        // object - new Employee("Dev", 1010, "Development") - returns null, because this objec creates a new memory reference and when looked up does not show up in any index, as it calculates a completely different hashcode
        System.out.println("HashCode for the 'dev' object: "+dev.hashCode());
        System.out.println("HashCode for the 'new' object: "+(new Employee("Dev", 1010, "Development").hashCode()));

        // in order to fix this we would have to overwrite equals and hashcode methods in the Employee class.

    }
}
