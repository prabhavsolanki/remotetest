package assignment5.Ans12;

import java.util.Arrays;
import java.util.List;

// 12. Find the first even number in the integer list which is greater than 3.

public class App {
    // Original List
    List<Integer> numbers = Arrays.asList(1,9,4,8,11,3,5,2,23,3,0,7,14);

    // Method that filters elements that are even and greater than 3 and returns the first such element
    Integer findFirst(){
        return numbers
                .stream()
                .filter(i -> i%2==0 && i>3)
                .findFirst()
                .orElse(null);
    }

    // Method to display list
    void display(){
        System.out.println(numbers);
    }

    public static void main(String[] args) {
        App app = new App();
        System.out.println("Original List: ");
        app.display();
        System.out.println("First even number greater then 3: " + app.findFirst());
    }
}

