package DesignPatterns.FactoryDesign;

public class EmployeeFactory {

    public Employee getEmployee(String str){
        if(str.equalsIgnoreCase("Software"))
            return new SoftwareDev();
        else
            if(str.equalsIgnoreCase("Graphics"))
                return new GraphicDesigner();
            else
                return null;

    }
}
