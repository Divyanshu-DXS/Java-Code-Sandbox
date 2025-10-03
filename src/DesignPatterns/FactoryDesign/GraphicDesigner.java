package DesignPatterns.FactoryDesign;

public class GraphicDesigner implements Employee {

    @Override
    public int salary() {
        System.out.println("This is a Graphic Designer position : ");
        return 70000;
    }
}
