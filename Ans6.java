package com.company;

import java.util.*;

public class Ans6 {
    // List storing Student objects
    List<Student> students = new ArrayList<>();

    // Method for adding student objects to list
    public void bulkAdd(){
        students.add(new Student("Yasan", 94.1, 21.5));
        students.add(new Student("Shayan", 94.1, 23.0));
        students.add(new Student("Zakwan", 91.0, 22.5));
        students.add(new Student("Nasir", 93.5, 22.0));
    }

    // Sorting students in 'natural' order
    public void studentSorter(){
        Collections.sort(students);
    }

    // Displaying students list
    public void displayStudents(){
        System.out.println("NAME ---- SCORE ---- AGE");
        for (Student student : students) {
            System.out.println(student.getName() + "   " + student.getScore() + "   " + student.getAge());
        }
    }
}

// Creating class object and invoking methods
class Driver6 {
    public static void main(String[] args) {
        Ans6 Ans6 = new Ans6();

        Ans6.bulkAdd();
        System.out.println("\nBefore sorting:");
        Ans6.displayStudents();
        Ans6.studentSorter();
        System.out.println("\nAfter sorting (by score and name):");
        Ans6.displayStudents();
    }
}
class Student implements Comparable<Student>{
    private String Name;
    private Double Score;
    private Double Age;

    // Parameterised constructor for adding students to list
    Student(String name, Double score, Double age){
        this.Name = name;
        this.Score = score;
        this.Age = age;
    }

    // Getters
    public String getName() {
        return Name;
    }
    public Double getScore() {
        return Score;
    }
    public Double getAge() {
        return Age;
    }

    // Overriding hashcode and equals to prevent same object conflicts
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(Name, student.Name) &&
                Objects.equals(Score, student.Score);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, Score);
    }

    // Defining the natural sorting order
    @Override
    public int compareTo(Student student) {
        if (this.Score < student.Score)
            return 1;
        else if(this.Score > student.Score)
            return -1;
        else {
            return this.Name.compareToIgnoreCase(student.Name);
        }
    }
}