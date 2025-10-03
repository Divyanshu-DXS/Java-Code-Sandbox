package DesignPatterns.Singleton;

public class AnimalEagerApproach {

    // this is an eager approach
    // one negative pointer about this is that it would always create an object even if it is not needed.
    // an object would be created the first thing, since it is static

    private static AnimalEagerApproach animal2 = new AnimalEagerApproach();

    public static AnimalEagerApproach getAnimal2(){
        return animal2;
    }
}
