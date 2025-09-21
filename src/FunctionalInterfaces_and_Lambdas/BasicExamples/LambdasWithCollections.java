package FunctionalInterfaces_and_Lambdas.BasicExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdasWithCollections {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        List<Integer> numbers = new ArrayList<>();

        words.addAll(List.of("These","All","Are","random","words","that", "will","be","operated","on","by","functions","impleminting","lambdas","."));
        numbers.addAll(Arrays.asList(1,3,41,1,567,1,462,1156,752,1,6247,373,484,73,262,2,21345));

        System.out.println("Orignal words array : "+words);
        System.out.println("Original Numbers array : "+numbers);

        // Filter words with exactly 3 characters
        List<String> wordsW3Chars = manipulateLists(words,s->s.length()==3);
        System.out.println("Words with exactly 3 characters in it from the original array : " + wordsW3Chars);

        // Filter words starting with 'b' || 'B'
        List<String> wordsStartingWithB = manipulateLists(words,s->s.charAt(0)=='b'||s.charAt(0)=='B');
        System.out.println("Words that start with 'B' in the original words list are : "+wordsStartingWithB);

        // Print all words in uppercase
        System.out.print("All words have been transformed to upper case : ");
        processWords(words, s->System.out.print(s.toUpperCase()+" "));
        System.out.println();

        // Create some numbers and test them
        List<Integer> evenNumbers = computeNumbers(numbers,s->s%2==0);
        System.out.println("Filtered numbers from original numbers array that are even : "+ evenNumbers);
    }
    public static List<String> manipulateLists(List<String> list, Predicate<String> predicate){
        List<String> newList = new ArrayList<>();
        for(String s : list){
            if(predicate.test(s))
                newList.add(s);
        }
        return newList;
    }
    public static void processWords(List<String> list, Consumer<String> consumer){
        for(String s : list){
            consumer.accept(s);
        }
    }
    public static List<Integer> computeNumbers(List<Integer> list,Predicate<Integer>predicate){
        List<Integer> nums = new ArrayList<>();
        for(Integer i : list){
            if(predicate.test(i))
                nums.add(i);
        }
        return nums;
    }


}
