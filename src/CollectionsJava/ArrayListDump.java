package CollectionsJava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class ArrayListDump {
    public static void main(String[] args) {

        System.out.println("ArrayList");
        // Adding elements
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("DEV");
        arr.add("DXS");
        arr.add("Divyanshu");
        arr.add("SID");
        System.out.println(arr);
        arr.addAll(List.of("Simmy","Abhinav","Sam","Marshall"));
        arr.add(1,"Manisha");

        // Size 
        System.out.println("size: " + arr.size());
        // get 
        System.out.println("first element: "+arr.get(0) + "\nLast element: "+ arr.get(arr.size()-1));
        // remove
        System.out.println(arr.remove(3));
        System.out.println("arrayList after removing element on index 3"+arr);
        // remove - with data type 
        arr.remove(String.valueOf("DXS"));
        System.out.println("arrayList after removing element using value of \"DXS\" "+arr);
        // set function 
        try{arr.set(3, "DEXTER");}
        catch(IndexOutOfBoundsException ex){
            arr.add("DEXTER");
            System.out.println("Was out of bound here. throws exception!");
        }
        System.out.println(arr);
        // iterating using for each loop
        for(String st :arr){
            System.out.println(st);
        }
        // Iterating on array using iterator 
        Iterator itr= arr.iterator();
        while(itr.hasNext()){
            System.out.println("Iterating Elements : "+itr.next());
        }
        // sort array
        System.out.println("Sorting array");
        Collections.sort(arr);
        System.out.println("Sorted Arraylist: "+ arr);
        arr.add("DIVYANSHU");
        System.out.println("Sorting array");
        Collections.sort(arr);
        System.out.println("Sorted Arraylist: "+ arr);

        // contains function
        System.out.println(arr.contains("Divyanshu")); // false
        System.out.println(arr.contains("DIVYANSHU")); // true
        System.out.println("Clearing the arraylist: ");
        arr.clear();
        System.out.println(arr);
    }
}

