package Inheritance;
public class InheritanceChildStudent extends InheritanceParentPerson{
    String name; 
    Short age;

    void display(){
        System.out.println("Species = "+ species); // This should be inherited from Parent class
        System.out.println("Name = "+ name);
        System.out.println("Age = "+ age);
    }
    void talk(){
        System.out.println("This Person Blabbers Student Stuff .. mostly Blah Blah");
    }
}
