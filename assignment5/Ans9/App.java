package assignment5.Ans9;

// 9. Collect all the even numbers from an integer list.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    // Original List of numbers
    List<Integer> numbers = Arrays.asList(1,2,3,4,8,7,9,6,81,12,7,65,49,35,78,19);

    // Method that filters even numbers from the list
    List<Integer> collectEven(){
        return numbers
                .stream()
                .filter((i) -> i%2==0)
                .collect(Collectors.toList());
    }

    // Method for displaying list
    void display(){
        System.out.println((numbers));
    }

    public static void main(String[] args) {
        App app = new App();
        System.out.println("Original List: ");
        app.display();
        System.out.println("Even numbers: ");
        System.out.println(app.collectEven());
    }
}
