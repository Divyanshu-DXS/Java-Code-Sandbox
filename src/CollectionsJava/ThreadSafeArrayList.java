package CollectionsJava;

import  java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class ThreadSafeArrayList {
    public static void main(String[] args) {
        // to make an array list thread safe there are 3 approaches we can take :
        // 1. Use the synchronization wrapper
        // 2. Use the copy on write array list
        // 3. Manually synchronize the array list

        System.out.println("*****************************");
        System.out.println("Using synchronization wrapper");

        List<String> arrList = new ArrayList<>();
        // now we can make this list synchronized

        List<String> syncArrList = Collections.synchronizedList(arrList);
        syncArrList.add("Dev");
        syncArrList.add("D");
        syncArrList.add("Deva");
        syncArrList.add("Matrix");

        // Iteration must be inside a synchronized block
        synchronized (syncArrList){
            for(String s : syncArrList){
                System.out.println(s);
            }
        }

        System.out.println("*****************************");
        System.out.println("Using CopyOnWriteArrayList from concurrent collections");

        CopyOnWriteArrayList<String> cpyOnWrtArrList = new CopyOnWriteArrayList<>();
        cpyOnWrtArrList.add("Text1");
        cpyOnWrtArrList.add("Text2");
        cpyOnWrtArrList.add("Text3");
        cpyOnWrtArrList.add("Text4");

        // for this here we would not need synchronized block to run operations
        for(String s: cpyOnWrtArrList){
            System.out.println(s);
        }
        // But to keep in mind, these iterations or operations can be heavy as it copies list everytime it performs that

        System.out.println("*****************************");
        System.out.println("Manual");

        // This however is not preferred as it is prone to errors and can get messy really fast.
        List<String> list = new ArrayList<>();
        synchronized (list) {
            list.add("A");
            list.add("B");
        }

    }
}
