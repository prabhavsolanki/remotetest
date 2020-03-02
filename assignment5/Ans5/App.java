package assignment5.Ans5;

// 5. Implement following functional interfaces from java.util.function using lambdas:
//  a. Consumer
//  b. Supplier
//  c. Predicate
//  d. Function

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class App {

    public void injectMiddleName(Object obj, Consumer consumer){
        System.out.print("Prabhav ");
        consumer.accept(obj);
        System.out.print(" Solanki");
    }

    public static void main(String[] args) {
        App app = new App();

// Implementing Consumer
        System.out.println("\nDisplaying full name by injecting middle name using Consumer: ");
        app.injectMiddleName("Prabhav", obj ->
                System.out.print(obj.toString().toUpperCase()));

// Implementing Supplier
        System.out.println("\n\nGetting a random value using Supplier: ");
        Supplier<Double> random = () -> Math.random() * 100;
        System.out.println("Random value: " + random.get().intValue());

// Implementing Predicate
        System.out.println("\nFiltering names starting with 's' in the following list using Predicate: \nOriginal list: ");
        List<String> names = Arrays.asList("Prabhav", "Alok", "Shaozae", "Shubham", "Abhishek");
        names.stream().forEach(System.out::println);
        System.out.println("\nFiltered list: ");
        names
                .stream().
                filter((s)->{
                    return s.startsWith("S");
                })
                .forEach(System.out::println);

// Implementing Function interface
        System.out.println("\nConverting String to Numeric type using Function: ");
        Function<String, Integer> aToI = str -> Integer.parseInt(String.valueOf(str));
        System.out.println("Numeric value of (String)'123' + (Integer)5 is: " + (aToI.apply("123")+5));

    }
}
