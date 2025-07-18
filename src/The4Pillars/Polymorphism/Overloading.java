package Polymorphism;

public class Overloading {
    int add(int a, int b){
        return a+b;
    }
    // overlading with different number of parameters 
    int add(int a, int b, int c){
        return a+b+c;
    }
    // overloading with different retun type
    float add(float a, int b){
        return a+b;
    }
    // overloading with anothet return type -- THIS DID NOT WORK NEED TO CHECK WHY ALTHOUGH HAS A DIIFERENT RETURN TYPE (VOID)
    // void add(int a, int b){
    //     System.out.println(a+b);
    // }
}
