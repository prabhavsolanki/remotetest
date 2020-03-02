package assignment5.Ans4;

// 4. Create an Employee Class with instance variables (String) name, (Integer)age, (String)city
// and get the instance of the Class using constructor reference


// Functional Interface whose function refers to the constructor of Employee
@FunctionalInterface
interface EmployeeInterface {
    Employee create(String name, Integer age, String city);
}

// Employee Class
class Employee {
    String name;
    Integer age;
    String city;

    // Constructor having signature similar to method of Functional Interface
    public Employee(String Name, Integer Age, String City){
        name = Name;
        age = Age;
        city = City;
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
    }
}

public class App {
    public static void main(String[] args) {
        // Getting the instance of Employee using constructor reference
        EmployeeInterface employeeInterface = Employee::new;
        employeeInterface.create("Prabhav", 23, "Greater Noida");
    }
}
