//Write a Java program that demonstrates the use of lambda expressions to sort a list of strings in reverse alphabetical order. Then, implement a functional interface StringProcessor with a method process(String str) that takes a string and returns its uppercase version. Use this functional interface in conjunction with a lambda expression to process a list of strings and print their uppercase forms.
 
//Hint: Use List.sort(), lambda expressions, and String::toUpperCase

import java.util.*;

@FunctionalInterface
interface StringProcessor {
    String process(String str);
}

public class Lambda {
    public static void main(String[] args) {
        //  Creating a list of strings
        List<String> words = Arrays.asList("apple", "orange", "banana", "grape", "mango");

        //  Sorting in reverse alphabetical order using lambda
        words.sort((s1, s2) -> s2.compareTo(s1));

        System.out.println("Sorted in reverse alphabetical order:");
        System.out.println(words);

        //  Using functional interface with lambda to convert strings to uppercase
        StringProcessor toUpperCaseProcessor = String::toUpperCase;

        System.out.println("\nStrings in uppercase:");
        words.forEach(word -> System.out.println(toUpperCaseProcessor.process(word)));
    }
}

