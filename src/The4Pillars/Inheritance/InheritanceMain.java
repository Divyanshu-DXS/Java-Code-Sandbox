package Inheritance;
public class InheritanceMain {
    public static void main(String[] args) {
        InheritanceChildStudent ob = new InheritanceChildStudent();
        InheritanceParentPerson ob2 = new InheritanceParentPerson();
        InheritanceParentPerson ob3 = new InheritanceChildStudent();

        ob.display();
        ob.talk();
        ob2.talk();
        ob3.talk();
    }
}