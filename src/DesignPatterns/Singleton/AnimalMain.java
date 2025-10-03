package DesignPatterns.Singleton;

public class AnimalMain {
    public static void main(String[] args) {

        // Lazy approach
        Animal animal1 = Animal.getAnimal();
        Animal animal2 = Animal.getAnimal();

        System.out.println("HashCode for animal 1: "+animal1.hashCode());
        System.out.println("HashCode for animal 2: "+animal2.hashCode());
    }
}
