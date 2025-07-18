package CollectionsJava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class ArrayListDump {
    public static void main(String[] args) {

        System.out.println("ArrayList");
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("DEV");
        arr.add("DXS");
        arr.add("Divyanshu");
        arr.add("Master");
        System.out.println(arr);

        System.out.println("size: " + arr.size());
        System.out.println("first element: "+arr.get(0) + "\nLast element: "+ arr.get(arr.size()-1));
        System.out.println(arr.remove(3));
        System.out.println("arrayList after removing element on index 3"+arr);
        try{arr.set(3, "DEXTER");}
        catch(IndexOutOfBoundsException ex){
            arr.add("DEXTER");
            System.out.println("Was out of bound here. throws exception!");
        }
        finally{
            System.out.println("FINALLYYYY !!! ");
        }
        System.out.println(arr);

        for(String st :arr){
            System.out.println(st);
        }
        System.out.println("Sorting array");
        Collections.sort(arr);
        System.out.println("Sorted Arraylist: "+ arr);
        arr.add("DIVYANSHU");
        System.out.println("Sorting array");
        Collections.sort(arr);
        System.out.println("Sorted Arraylist: "+ arr);
        System.out.println("Clearing the arraylist: ");
        arr.clear();
        System.out.println(arr);
    }
}

