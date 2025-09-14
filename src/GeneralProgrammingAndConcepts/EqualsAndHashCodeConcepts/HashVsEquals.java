package GeneralProgrammingAndConcepts.EqualsAndHashCodeConcepts;

public class HashVsEquals {
    public static void main(String[] args) {
        // Working with Strings and checking how equals(), ==, and hashCode works and what should the results be if the Strings are identical but referenced individually
        String s1 = new String("newtext");
        String s2 = new String("newtext");
        // System.out.println("S1 == S2 : " + s1==s2); --> why does this not print S1 == S2 part of the string and only returns the value
        // Answer to that is Operator precedence. '+' has a higher precedence than == so it computes to ' ("S1 == S2 : " + s1) == s2 '
        System.out.println("S1 == S2 : " + (s1==s2)); // Here the reference addresses are compared
        System.out.println("S1.equals(S2) : "+(s1.equals(s2))); // Here the equals method in the String class has been overwritten to compare Content of the Strings
        System.out.println("Comparing HashCodes for the Strings S1 and S2: "+ (s1.hashCode()==(s2.hashCode()))); //hashCode method has also been overwritten in String Class
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println();

        // Working with objects
        HsEqualsExampleStudent student1 = new HsEqualsExampleStudent("Dev", "SoftwareArchitecture");
        HsEqualsExampleStudent student2 = new HsEqualsExampleStudent("Dev", "SoftwareArchitecture");
        // Overwritten the equals() in the HsEqualsExampleStudent class
        System.out.println("Comparing objects with the equals() : "+student1.equals(student2));
        // By default, the equals() method inherited from java.lang.Object performs a reference comparison.
        // This means it returns true only if both object references point to the exact same memory location and since these 2 are different objects it returns false.
        // In order to have equals compare the content instead we would have to override the equals method in the HsEqualsExampleStudent class

        // hashCode() has also been overwritten now in the HsEqualsExampleStudent class
        System.out.println("Comparing Object's (With Identical Set Of Data Members) hashcodes : "+(student1.hashCode()==student2.hashCode()));
        System.out.println("HashCode for Student 1 : " + student1.hashCode());
        System.out.println("HashCode for Student 2 : " + student2.hashCode());
        // hashcode() method generates a unique value based on the object's memory address or reference, not its internal data.
        // To make the hash code the same for objects with the same data, you must override the hashCode() method in your class to compute the hash based on the object's data members
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println();

    }
}
