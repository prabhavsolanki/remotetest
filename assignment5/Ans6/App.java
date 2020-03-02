package assignment5.Ans6;

// 6. Create and access default and static method of an interface.


interface ModernInterface {
    // normal methods must be provided implementation by every class that implements the interface
    void mustImplementMe();

    // Implementation of default methods can be ignored in classes that implement the interface
    default void canIgnoreImplementingMe(){
        System.out.println("Default method: 'Classes may or may not implement my definition'");
    }

    // Implementation of static methods too can be ignored in classes that implement the interface,
    // however, if they are implemented, their implementation CANNOT be changed
    static void cannotOverrideMe(){
        System.out.println("Static method: 'Classes my or may not implement my definition but CANNOT change my implementation");
    }
}

public class App implements ModernInterface{
    @Override
    public void mustImplementMe() {
        System.out.println("Normal method: 'Classes must implement methods that aren't default or static.'");
    }

    public static void main(String[] args) {
        App app = new App();

        // Invoking normal method of Interface
        app.mustImplementMe();

        // Invoking default method of Interface
        app.canIgnoreImplementingMe();

        //Invoking static method of Interface
        ModernInterface.cannotOverrideMe();

    }
}
