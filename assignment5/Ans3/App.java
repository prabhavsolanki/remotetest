package assignment5.Ans3;

// 3. Using (instance) Method reference create and apply add and subtract method and
// using (Static) Method reference create and apply multiplication method for the functional interface created.

// Functional Interfaces
@FunctionalInterface
interface AdderInterface {
    void add(int a, int b);
}
@FunctionalInterface
interface SubtractorInterface {
    void subtract(int a, int b);
}
@FunctionalInterface
interface MultiplierInterface {
    void multiplication(int a, int b);
}

public class App {

    // Method definitions for method referencing
    void add(int a, int b){
        System.out.println(a + " + " + b + " = " + (a+b));
    }
    void subtract(int a, int b){
        System.out.println(a + " - " + b + " = " + (a-b));
    }
    static void multiplication(int a, int b){
        System.out.println(a + " x " + b + " = " + (a*b));
    }

    public static void main(String[] args) {

        // Providing method references to methods of functional interfaces
        AdderInterface adderInterface = new App()::add;
        SubtractorInterface subtractorInterface = new App()::subtract;

        MultiplierInterface multiplierInterface = App::multiplication;

        System.out.println("METHOD REFERENCE");

        // Invoking Functional interface methods
        System.out.println("\nUsing instance method reference: ");
        adderInterface.add(11, 13);
        subtractorInterface.subtract(39, 13);
        System.out.println("\nUsing static method reference: ");
        multiplierInterface.multiplication(11, 3);

    }
}
