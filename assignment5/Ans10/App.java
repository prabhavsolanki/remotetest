package assignment5.Ans10;

// 10. Sum of all the numbers greater than 5 in the integer list.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    // Original List
    List<Integer> numbers = Arrays.asList(1,9,4,8,11,3,5,2,23,3,0,7,14);

    // Method that first filters numbers greater than 5 and then finds their sum by mapping ovr the numbers.
    Integer sum(){
        int sum = 0;
        return numbers
                .stream()
                .filter((i)-> i>5)
                .mapToInt(Integer::intValue)
                .sum();
    }

    // Method for displaying list
    void display(){
        System.out.println(numbers);
    }

    public static void main(String[] args) {
        App app = new App();
        System.out.println("Original list: ");
        app.display();
        System.out.println("Sum of numbers greater than 5 = " + app.sum());
    }
}
