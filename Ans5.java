package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ans5 {

    // List storing Employee objects
    List<Employee> employees = new ArrayList<>();

    // Method to add employees to list
    public void bulkAdd(){
        employees.add(new Employee(23.0, 15000.0, "Shayan"));
        employees.add(new Employee(22.0, 60000.0, "Rishabh"));
        employees.add(new Employee(23.0, 45000.0, "Ammar"));
        employees.add(new Employee(25.0, 30000.0, "Fahad"));
        employees.add(new Employee(21.0, 50000.0, "Ankur"));
    }

    // Method to sort employee list using custom comparator
    public void employeeSorter(){
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if(o1.getSalary() < o2.getSalary())
                    return 1;
                else if(o1.getSalary() > o2.getSalary())
                    return -1;
                else
                    return 0;
            }
        });
    }

    // Method for displaying employees
    public void displayEmployees(){
        System.out.println("NAME --- SALARY --- AGE ");
        for (Employee employee : employees) {
            System.out.println(employee.getName() + "   " + employee.getSalary() + "   " + employee.getAge());
        }
    }
}

class Driver5 {
    public static void main(String[] args) {
        Ans5 obj = new Ans5();

        obj.bulkAdd();
        System.out.println("\nBefore sorting:");
        obj.displayEmployees();
        obj.employeeSorter();
        System.out.println("\nAfter sorting by salary:");
        obj.displayEmployees();
    }
}
class Employee {
    private Double Age;
    private Double Salary;
    private String Name;

    public Employee(Double age, Double salary, String name){
        this.Age = age;
        this.Salary = salary;
        this.Name = name;
    }

    // Getters
    public Double getAge() {
        return Age;
    }
    public Double getSalary() {
        return Salary;
    }
    public String getName() {
        return Name;
    }

}