package DesignPatterns.Singleton;

public class AnimalThreadSafety {

    // We will work on thread safety on this one.
    // We will make it synchronous
    private static AnimalThreadSafety animal ;
    private AnimalThreadSafety() {
    }

    public static AnimalThreadSafety getAnimal(){

        if(animal==null){
            synchronized (AnimalThreadSafety.class) {
                if(animal==null) {
                    animal = new AnimalThreadSafety();
                    return animal;
                }
            }
        }

        return animal;
    }
}
