package Optionals;

public class TestingOptional {
    public static void main(String[] args) {

        String str = getNumber(2);
        System.out.println(str.toUpperCase()); // Currently this will throw us a null pointer exception because getNumber() returns null

        

    }
    public static String getNumber(int x){

        return null;
    }
}
