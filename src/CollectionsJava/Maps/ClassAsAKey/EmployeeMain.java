package CollectionsJava.Maps.ClassAsAKey;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeMain {
    public static void main(String[] args) {
        // Lets create a hashmap that will take Employee class as a key to see how it impacts and what are the things to remember'

        Map<Employee,String> empLocation = new HashMap<>();
        // adding values to the hashmap
        List<String> devTechStack = new ArrayList<>(List.of("Java","Backend","devops","Cybersecurity"));
        List<String> divineTechStack = new ArrayList<>(List.of("Java","Backend","serverMGT"));
        List<String> jatinTechStack = new ArrayList<>(List.of("HR","CRM","Onboarding","TeamMGT"));
        List<String> zakirTechStack = new ArrayList<>(List.of("devOps","React","S/W Dev","Cybersecurity"));
        List<String> bileeshTechStack = new ArrayList<>(List.of("Java","Frontend","devops","operatoins"));
        List<String> stibyTechStack = new ArrayList<>(List.of("Java","Backend","devops"));
        Employee dev = new Employee("Dev", 1010, "Development",devTechStack);
        Employee divine = new Employee("Divine", 1013, "Development",divineTechStack);
        Employee jatin = new Employee("Jatin", 1042, "Management",jatinTechStack);
        Employee zakir = new Employee("Zakir", 1017, "DevOps",zakirTechStack);
        Employee bileesh =new Employee("Bileesh", 1022, "Networking",bileeshTechStack);
        Employee stiby = new Employee("Stiby", 1011, "Consultant",stibyTechStack);
        empLocation.put(dev,"Waterloo");
        empLocation.put(divine,"Missisauga");
        empLocation.put(zakir,"London");
        empLocation.put(jatin,"Brampton");
        empLocation.put(bileesh,"Hyderabad");
        empLocation.put(stiby,"Vancouver");

        System.out.println(empLocation);

        System.out.println("********************************");
//        // this map currently has a record of objects that we have defined above.
//        // if I was to check if either of the key is equal and if they return the same value when get is used for any given key, lets try that
//        System.out.println(empLocation.get(dev).equals(empLocation.get(new Employee("Dev", 1010, "Development"))));
//        // this returns false because equals compares object address references unless overwritten

//        // to demonstrate lets print the values we get from these operations..
//        System.out.println("Value from obj 'dev' : "+ empLocation.get(dev));
//        System.out.println("Value from obj 'new Employee(\"Dev\", 1010, \"Development\")' : "+ empLocation.get(new Employee("Dev", 1010, "Development")));
//        /* Output received :
//        * Value from obj 'dev' : Waterloo
//        * Value from obj 'new Employee("Dev", 1010, "Development")' : null
//        * */

//        // object - new Employee("Dev", 1010, "Development") - returns null, because this object creates a new memory reference and when looked up does not show up in any index, as it calculates a completely different hashcode
//        System.out.println("HashCode for the 'dev' object: "+dev.hashCode());
//        System.out.println("HashCode for the 'new' object: "+(new Employee("Dev", 1010, "Development").hashCode()));
//        /* Output received :
//        * HashCode for the 'dev' object: 705927765
//        * HashCode for the 'new' object: 621009875
//        * */

//        // in order to fix this we would have to overwrite equals and hashcode methods in the Employee class.

        System.out.println("********************************");
//        // Trying again post overwriting equals and hashcode method in Employee class
//        System.out.println(empLocation.get(dev).equals(empLocation.get(new Employee("Dev", 1010, "Development"))));
//        // it now returns true as the vales we get from the keys are same
//        System.out.println("Value from obj 'dev' : "+ empLocation.get(dev));
//        System.out.println("Value from obj 'new Employee(\"Dev\", 1010, \"Development\")' : "+ empLocation.get(new Employee("Dev", 1010, "Development")));
//        // the hashcodes also match
//        System.out.println("HashCode for the 'dev' object: "+dev.hashCode());
//        System.out.println("HashCode for the 'new' object: "+(new Employee("Dev", 1010, "Development").hashCode()));
//
//        // this then brings us to the important point of class mutability
//        // because of which if there is a change made, the object refeences would not match and the previously put object can be forever lost in the map as we would not be able to get to that index
//        // for instance lets change the role for an employee listed and check again
//        // using object - jatin
//        System.out.println("Current value for the object Jatin is : "+empLocation.get(jatin));
//        // returns true
//        // changing value for dept for this object and checking again
//        jatin.setDept("Human Resources");
//        // new value returned when .get() is used with same object
//        System.out.println("New value for the object Jatin after modification is : "+empLocation.get(jatin));
//        // returns null because now when the object is called in as a key for the hashmap, the index caluclated is not the same as before
//        // since the dept value for the object was changed it changed the hashcode as well
//        // this points to the fact that if a class is being used as a key to the hashmap, the class has to be made immutable
//        // to make class immutable - we remove all the setter methods and also make all the data members private and final

        System.out.println("********************************");
        // Now that we have made the class immutable the object can not be changed and hence the hashcode returned should always be the same.
        // But still this does not ensure 100 % immutability
        // Lets add one more data member to the Employee class and see how would that impact
        // We have now added a techStack arraylist corresponding to each object above.
        // the Employee class is still immutable with final and no setter methods
        // But this array list that has been added to it, although final is made still mutable and subject to change
        // this is how :
        System.out.println(dev);
        dev.getTechStack().add("AI integration");
        System.out.println("Modification has been now made to dev's TechStack");
        System.out.println(dev);
        // which means that the object must have changed again and getting this object will result in a  null value again
        System.out.println(empLocation.get(dev));

    }
}
