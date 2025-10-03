package DesignPatterns.FactoryDesign;

public class SoftwareDev implements Employee{
    public int salary(){
        System.out.println("This is a Software Developer positoin : ");
        return 140000;
    }
}
