package assignment5.Ans7;

// 7.  Override the default method of the interface.

interface ModernInterface {
    // method definition in interface
    default void display(){
        System.out.println("Displaying before overriding");
    }
}

public class App implements ModernInterface{

    // Overriding method definition in class that implemented interface
    @Override
    public void display() {
        System.out.println("Displaying after overriding default method in class");
    }

    public static void main(String[] args) {
        App app = new App();
        app.display();
    }
}
