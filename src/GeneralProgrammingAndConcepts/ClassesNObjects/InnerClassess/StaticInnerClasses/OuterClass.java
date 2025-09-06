package GeneralProgrammingAndConcepts.ClassesNObjects.InnerClassess.StaticInnerClasses;

class InnerClass {
    static class StaticInnerClass{
        void showMsg(){
            System.out.println("Print this message inside static class");
        }
    }

}
public class OuterClass {

    public static void main(String[] args) {
        InnerClass.StaticInnerClass inner = new InnerClass.StaticInnerClass();
        inner.showMsg();
    }
}


