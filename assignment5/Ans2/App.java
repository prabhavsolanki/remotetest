package assignment5.Ans2;

// 2. Create a functional interface whose method takes 2 integers and return one integer.

@FunctionalInterface
interface TwoToOne {
    // Method takes two integers as arguments and return an integer
    int twoToOne(int a, int b);
}

public class App {
    public static void main(String[] args) {
        // Method take a and b as arguments and returns their sum
        TwoToOne obj = (a,b) -> a+b;

        System.out.println("12+15 = " + obj.twoToOne(12, 15));
    }
}
