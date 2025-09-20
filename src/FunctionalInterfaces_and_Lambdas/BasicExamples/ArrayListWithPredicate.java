package FunctionalInterfaces_and_Lambdas.BasicExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ArrayListWithPredicate {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Random");
        list.add("Words");
        list.add("in");
        list.add("order");
        list.add("new");
        list.add("to");
        list.add("functional");
        list.add("interfaces");
        list.add("using");
        list.add("lambdas");
        list.add("Predicate");
        list.add("interface");

        System.out.println(stringsWithlessThan5Chars(list));
    }

    private static List<String> stringsWithlessThan5Chars(List<String> list) {

        List<String> newlist = new ArrayList<>();
        Predicate<String> predicate = s -> s.length()<=5;
        for(String s : list){
            if(predicate.test(s))
                newlist.add(s);
        }
        return newlist;
    }
}
