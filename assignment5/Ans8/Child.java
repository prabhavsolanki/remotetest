package assignment5.Ans8;

// Parent 1
interface Father {
    default void skill(){
        System.out.println("Father: 'Hey'");
    }
}

// Parent 2
interface Mother {
    default void skill(){
        System.out.println("Mother: 'Hello'");
    }
}

// Child implementing both parents i.e. Multiple inheritance
public class Child implements Father, Mother {

    // Overriding the method common in both parents
    @Override
    public void skill() {
        Father.super.skill();
        Mother.super.skill();
        System.out.println("Child: 'Heyo'");
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.skill();
    }
}
