package Encapsulation;

public class StudentEncapsulatoin {
    // private data member
    private String name;

    // this is a get method to get the value of private data member
    public String getName(){
        return name;
    }


    // this is a set method to set the value of private data member
    public void setName(String newName){
        this.name=newName;
    }
}
