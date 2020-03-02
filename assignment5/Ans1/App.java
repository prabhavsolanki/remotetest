package assignment5.Ans1;

// Write the following a functional interface and implement it using lambda:
//(1) First number is greater than second number or not       Parameter (int ,int ) Return boolean
//(2) Increment the number by 1 and return incremented value  Parameter (int) Return int
//(3) Concatination of 2 string                               Parameter (String , String ) Return (String)
//(4) Convert a string to uppercase and return .              Parameter (String) Return (String)


// Creating functional interfaces
@FunctionalInterface
interface FirstGreater {
    boolean firstGreaterThanSecond(int first, int second);
}

@FunctionalInterface
interface Incrementer {
    int increment(int a);
}

@FunctionalInterface
interface Concatenator {
    String concatenate(String first, String second);
}

@FunctionalInterface
interface CaseChanger {
    String toUpper(String str);
}

public class App {
    public static void main(String[] args) {
        // Defining lambda expressions
        FirstGreater firstGreater = (a,b) -> a>b;
        Incrementer incrementer = a -> ++a;
        Concatenator concatenator = (first, second) -> first+" "+second;
        CaseChanger caseChanger = str -> str.toUpperCase();

        // Invoking methods defined by lambda expressions
        System.out.println("5 > 9: " + firstGreater.firstGreaterThanSecond(5, 9));
        System.out.println("11 incremented by 1: " + incrementer.increment(11));
        System.out.println("'Hello'+'World': " + concatenator.concatenate("Hello", "World"));
        System.out.println("'run' in upper case: " + caseChanger.toUpper("run!!"));
    }
}
