package FunctionalInterfaces_and_Lambdas.BasicExamples;

@FunctionalInterface
public interface LearningInterfaceFunc {
    String getSubject(String subject, int hours);
    default void learning(){
        System.out.println("Learning subjects");
    }
}
