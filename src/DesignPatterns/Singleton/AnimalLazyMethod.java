package DesignPatterns.Singleton;

public class AnimalLazyMethod {

    private static AnimalLazyMethod animal;

    // Make the constructor private so that it can not be instantiated by different calls that can result into multiple objects
    // this ensures there is going to be only one single object
    // this also have one more negative factor in common -  not thread safe
    private AnimalLazyMethod() {
    }

    // This is said to be a lazy approach
    // we create this method to get the object since constructor has been made private, can not be called or accessed by any other class
    // this method has also been made static so that we do not need an object to reference this and can be called directly
    public static AnimalLazyMethod getAnimal(){
        if(animal==null){
            animal=new AnimalLazyMethod();
            return animal;
        }

        return animal;
    }
}
