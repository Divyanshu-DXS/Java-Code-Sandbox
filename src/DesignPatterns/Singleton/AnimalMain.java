package DesignPatterns.Singleton;

public class AnimalMain {
    public static void main(String[] args) {

        // Lazy approach
        AnimalLazyMethod animal1 = AnimalLazyMethod.getAnimal();
        AnimalLazyMethod animal2 = AnimalLazyMethod.getAnimal();

        System.out.println("HashCode for animal 1: "+animal1.hashCode());
        System.out.println("HashCode for animal 2: "+animal2.hashCode());
        System.out.println("***************");

        // Eager approach

        AnimalEagerApproach animal3 = AnimalEagerApproach.getAnimal2();
        AnimalEagerApproach animal4 = AnimalEagerApproach.getAnimal2();
        System.out.println("HashCode for animal 3: "+animal3.hashCode());
        System.out.println("HashCode for animal 4: "+animal4.hashCode());
        System.out.println("***************");

        // Thread Safe approach
        AnimalThreadSafety animal5 = AnimalThreadSafety.getAnimal();
        AnimalThreadSafety animal6 = AnimalThreadSafety.getAnimal();
        System.out.println("HashCode for animal 5: "+animal5.hashCode());
        System.out.println("HashCode for animal 6: "+animal6.hashCode());


    }
}
