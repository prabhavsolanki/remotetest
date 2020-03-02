package assignment5.Ans11;

// 11. Find average of the number inside integer list after doubling it.

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;

public class App {
    // Original List
    List<Integer> numbers = Arrays.asList(1,9,4,8,11,3,5,2,23,3,0,7,14);

    // Method that maps each number, multiplying it by 2 then extracting average from its summaryStatistics
    Double average(){
        return numbers
                .stream()
                .mapToInt(i -> i*2)
                .summaryStatistics()
                .getAverage();
    }

    // Method to display list
    void display(){
        System.out.println(numbers);
    }

    public static void main(String[] args) {
        App app = new App();
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Original List: ");
        app.display();
        System.out.println("Average after doubling every number = " + df.format(app.average()));
    }
}
