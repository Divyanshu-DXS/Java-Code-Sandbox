package Polymorphism;

public class PolymorphismMain {
    public static void main(String[] args) {
        Overloading ob = new Overloading();
        System.out.println(ob.add(10, 20));
        System.out.println(ob.add(12.0f, 02));
        System.out.println(ob.add(2, 012, 013)); 
        // Why does this return value = 23 while I expect 27 -- Any number starting with 0 in Java is interpreted as an octal (base-8) number.
        System.out.println(ob.add(2, 12, 13));
        ob.add(12.0f, 02);
        ob.add(2, 012, 013);
    }
}
