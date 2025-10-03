package DesignPatterns.Singleton;

public class Animal {

    private static Animal animal;

    // Make the constructor private so that it can not be instantiated by different calls that can result into multiple objects
    // this ensures there is going to be only one single object
    private Animal() {
    }

    // This is said to be a lazy approach
    // we create this method to get the object since constructor has been made private, can not be called or accessed by any other class
    // this method has also been made static so that we do not need an object to reference this and can be called directly
    public static Animal getAnimal(){
        if(animal==null){
            animal=new Animal();
            return animal;
        }

        return animal;
    }
}
